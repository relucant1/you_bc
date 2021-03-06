package com.youbc.controllers.protected_api;

import com.youbc.database.MatchedUsersDAO;
import com.youbc.database.ProfileDAO;
import com.youbc.exceptions.YouBCError;
import com.youbc.exceptions.YouBCException;
import com.youbc.models.MatchedUser;
import com.youbc.models.MatchedUserResponse;
import com.youbc.models.profile.UserProfile;
import com.youbc.utilities.Endpoints;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.Set;
import java.util.TreeSet;

@RestController
public class MatchedUsersController {

    private MatchedUsersDAO matchedUsersDAO;
    private ProfileDAO profileDAO;

    @Autowired
    public MatchedUsersController(
            MatchedUsersDAO matchedUsersDAO,
            ProfileDAO profileDAO
    ) {
        this.matchedUsersDAO = matchedUsersDAO;
        this.profileDAO = profileDAO;
    }

    @RequestMapping(path = Endpoints.MATCHED_USERS, method = RequestMethod.GET)
    public MatchedUserResponse getAllMatchedUsers(HttpServletRequest request) {
        Set<MatchedUser> matchedUsers = new TreeSet<>();
        Integer userId = (Integer) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        Set<Integer> matchedUserIds = matchedUsersDAO.fetchAllMatchedUsers(userId);
        Integer matchCount = matchedUsersDAO.fetchMatchCount(userId);
        // construct matchedUsers set
        for(Integer theOther : matchedUserIds) {
            UserProfile userProfile = profileDAO.fetchUserProfile(theOther)
                    .orElseThrow(() -> new YouBCException(new YouBCError(HttpStatus.NOT_FOUND, "no user found", "no user found")));
            matchedUsers.add(new MatchedUser(
                    userProfile.getAvatarUrl(),
                    userProfile.getUsername(),
                    userProfile.getWeChatId(),
                    matchedUsersDAO.getLatestLikeTime(userId, theOther),
                    matchedUsersDAO.matchedAtClassmates(userId, theOther),
                    matchedUsersDAO.matchedAtFriends(userId, theOther),
                    matchedUsersDAO.matchedAtRoommates(userId, theOther)
            ));
        }
        // get number of new matches the user missed
        Integer newMatch = matchedUserIds.size() - matchCount;
        // update new total match counts
        matchedUsersDAO.updateMatchCount(userId, matchedUserIds.size());
        return new MatchedUserResponse(newMatch, matchedUsers);
    }
}
