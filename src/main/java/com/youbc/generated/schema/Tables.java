/*
 * This file is generated by jOOQ.
*/
package com.youbc.generated.schema;


import com.youbc.generated.schema.tables.ClassmatesCourses;
import com.youbc.generated.schema.tables.ClassmatesDislikes;
import com.youbc.generated.schema.tables.ClassmatesLikes;
import com.youbc.generated.schema.tables.ClassmatesMajor;
import com.youbc.generated.schema.tables.ClassmatesProfile;
import com.youbc.generated.schema.tables.ClassmatesProfileCourses;
import com.youbc.generated.schema.tables.ClassmatesProfileTags;
import com.youbc.generated.schema.tables.ClassmatesTags;
import com.youbc.generated.schema.tables.Faculties;
import com.youbc.generated.schema.tables.FriendsDislikes;
import com.youbc.generated.schema.tables.FriendsLikes;
import com.youbc.generated.schema.tables.FriendsProfile;
import com.youbc.generated.schema.tables.FriendsProfileTags;
import com.youbc.generated.schema.tables.FriendsTags;
import com.youbc.generated.schema.tables.ProfileImage;
import com.youbc.generated.schema.tables.RelationshipStatus;
import com.youbc.generated.schema.tables.RoommatesDislikes;
import com.youbc.generated.schema.tables.RoommatesHometown;
import com.youbc.generated.schema.tables.RoommatesLikes;
import com.youbc.generated.schema.tables.RoommatesLocations;
import com.youbc.generated.schema.tables.RoommatesProfile;
import com.youbc.generated.schema.tables.RoommatesProfileTags;
import com.youbc.generated.schema.tables.RoommatesTags;
import com.youbc.generated.schema.tables.StudentVerification;
import com.youbc.generated.schema.tables.User;
import com.youbc.generated.schema.tables.UserProfile;

import javax.annotation.Generated;


/**
 * Convenience access to all tables in poke_you_bc
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.9.1"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Tables {

    /**
     * The table <code>poke_you_bc.classmates_courses</code>.
     */
    public static final ClassmatesCourses CLASSMATES_COURSES = com.youbc.generated.schema.tables.ClassmatesCourses.CLASSMATES_COURSES;

    /**
     * The table <code>poke_you_bc.classmates_dislikes</code>.
     */
    public static final ClassmatesDislikes CLASSMATES_DISLIKES = com.youbc.generated.schema.tables.ClassmatesDislikes.CLASSMATES_DISLIKES;

    /**
     * The table <code>poke_you_bc.classmates_likes</code>.
     */
    public static final ClassmatesLikes CLASSMATES_LIKES = com.youbc.generated.schema.tables.ClassmatesLikes.CLASSMATES_LIKES;

    /**
     * The table <code>poke_you_bc.classmates_major</code>.
     */
    public static final ClassmatesMajor CLASSMATES_MAJOR = com.youbc.generated.schema.tables.ClassmatesMajor.CLASSMATES_MAJOR;

    /**
     * The table <code>poke_you_bc.classmates_profile</code>.
     */
    public static final ClassmatesProfile CLASSMATES_PROFILE = com.youbc.generated.schema.tables.ClassmatesProfile.CLASSMATES_PROFILE;

    /**
     * The table <code>poke_you_bc.classmates_profile_courses</code>.
     */
    public static final ClassmatesProfileCourses CLASSMATES_PROFILE_COURSES = com.youbc.generated.schema.tables.ClassmatesProfileCourses.CLASSMATES_PROFILE_COURSES;

    /**
     * The table <code>poke_you_bc.classmates_profile_tags</code>.
     */
    public static final ClassmatesProfileTags CLASSMATES_PROFILE_TAGS = com.youbc.generated.schema.tables.ClassmatesProfileTags.CLASSMATES_PROFILE_TAGS;

    /**
     * The table <code>poke_you_bc.classmates_tags</code>.
     */
    public static final ClassmatesTags CLASSMATES_TAGS = com.youbc.generated.schema.tables.ClassmatesTags.CLASSMATES_TAGS;

    /**
     * The table <code>poke_you_bc.faculties</code>.
     */
    public static final Faculties FACULTIES = com.youbc.generated.schema.tables.Faculties.FACULTIES;

    /**
     * The table <code>poke_you_bc.friends_dislikes</code>.
     */
    public static final FriendsDislikes FRIENDS_DISLIKES = com.youbc.generated.schema.tables.FriendsDislikes.FRIENDS_DISLIKES;

    /**
     * The table <code>poke_you_bc.friends_likes</code>.
     */
    public static final FriendsLikes FRIENDS_LIKES = com.youbc.generated.schema.tables.FriendsLikes.FRIENDS_LIKES;

    /**
     * The table <code>poke_you_bc.friends_profile</code>.
     */
    public static final FriendsProfile FRIENDS_PROFILE = com.youbc.generated.schema.tables.FriendsProfile.FRIENDS_PROFILE;

    /**
     * The table <code>poke_you_bc.friends_profile_tags</code>.
     */
    public static final FriendsProfileTags FRIENDS_PROFILE_TAGS = com.youbc.generated.schema.tables.FriendsProfileTags.FRIENDS_PROFILE_TAGS;

    /**
     * The table <code>poke_you_bc.friends_tags</code>.
     */
    public static final FriendsTags FRIENDS_TAGS = com.youbc.generated.schema.tables.FriendsTags.FRIENDS_TAGS;

    /**
     * The table <code>poke_you_bc.profile_image</code>.
     */
    public static final ProfileImage PROFILE_IMAGE = com.youbc.generated.schema.tables.ProfileImage.PROFILE_IMAGE;

    /**
     * The table <code>poke_you_bc.relationship_status</code>.
     */
    public static final RelationshipStatus RELATIONSHIP_STATUS = com.youbc.generated.schema.tables.RelationshipStatus.RELATIONSHIP_STATUS;

    /**
     * The table <code>poke_you_bc.roommates_dislikes</code>.
     */
    public static final RoommatesDislikes ROOMMATES_DISLIKES = com.youbc.generated.schema.tables.RoommatesDislikes.ROOMMATES_DISLIKES;

    /**
     * The table <code>poke_you_bc.roommates_hometown</code>.
     */
    public static final RoommatesHometown ROOMMATES_HOMETOWN = com.youbc.generated.schema.tables.RoommatesHometown.ROOMMATES_HOMETOWN;

    /**
     * The table <code>poke_you_bc.roommates_likes</code>.
     */
    public static final RoommatesLikes ROOMMATES_LIKES = com.youbc.generated.schema.tables.RoommatesLikes.ROOMMATES_LIKES;

    /**
     * The table <code>poke_you_bc.roommates_locations</code>.
     */
    public static final RoommatesLocations ROOMMATES_LOCATIONS = com.youbc.generated.schema.tables.RoommatesLocations.ROOMMATES_LOCATIONS;

    /**
     * The table <code>poke_you_bc.roommates_profile</code>.
     */
    public static final RoommatesProfile ROOMMATES_PROFILE = com.youbc.generated.schema.tables.RoommatesProfile.ROOMMATES_PROFILE;

    /**
     * The table <code>poke_you_bc.roommates_profile_tags</code>.
     */
    public static final RoommatesProfileTags ROOMMATES_PROFILE_TAGS = com.youbc.generated.schema.tables.RoommatesProfileTags.ROOMMATES_PROFILE_TAGS;

    /**
     * The table <code>poke_you_bc.roommates_tags</code>.
     */
    public static final RoommatesTags ROOMMATES_TAGS = com.youbc.generated.schema.tables.RoommatesTags.ROOMMATES_TAGS;

    /**
     * The table <code>poke_you_bc.student_verification</code>.
     */
    public static final StudentVerification STUDENT_VERIFICATION = com.youbc.generated.schema.tables.StudentVerification.STUDENT_VERIFICATION;

    /**
     * The table <code>poke_you_bc.user</code>.
     */
    public static final User USER = com.youbc.generated.schema.tables.User.USER;

    /**
     * The table <code>poke_you_bc.user_profile</code>.
     */
    public static final UserProfile USER_PROFILE = com.youbc.generated.schema.tables.UserProfile.USER_PROFILE;
}
