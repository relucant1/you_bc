package com.youbc.controllers;

import com.amazonaws.services.s3.model.CannedAccessControlList;
import com.youbc.database.UserDAO;
import com.youbc.error_handling.YouBCError;
import com.youbc.error_handling.YouBCException;
import com.youbc.services.aws.S3Client;
import com.youbc.services.notification.NotificationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.Collections;

@RestController
public class DemoController {
    private UserDAO userDAO;
    private S3Client s3Client;
    private NotificationService notificationService;


    @Autowired
    public DemoController(UserDAO userDAO, S3Client s3Client, NotificationService notificationService) {
        this.userDAO = userDAO;
        this.s3Client = s3Client;
        this.notificationService = notificationService;
    }

    @RequestMapping(path = "/notify", method = RequestMethod.GET)
    public String triggerNotification() {

        notificationService.triggerNotification(
                "my-channel", "my-event", Collections.singletonMap("message", "hello world")
        );

        return "demo notification";
    }

    @RequestMapping(path = "/demoJooq", method = RequestMethod.GET)
    public String demoJooq() {
        //userDAO.buildNewUser("some_user_id");
        return "demoJooq";
    }

    @RequestMapping(path = "/demoJooq2", method = RequestMethod.GET)
    public boolean demoJooq2() {
        return userDAO.userExists("sdakjf38");
    }

    @RequestMapping(path = "/api/demoJooq", method = RequestMethod.GET)
    public String demoJooqAPI() {
        //userDAO.buildNewUser("some_user_id");
        return "demoJooqAPI";
    }

    @RequestMapping(path = "/exception")
    public String testException() {
        throw new YouBCException(new YouBCError(HttpStatus.BAD_REQUEST, "demo", "demo exception"));
    }

    @RequestMapping(path = "/testVoid", method = RequestMethod.POST)
    @ResponseStatus(value = HttpStatus.OK)
    public void testReturnNoting() {
        if (false) {
            System.out.println("success");
        } else {
            throw new YouBCException(new YouBCError(HttpStatus.BAD_REQUEST, "demo", "demo exception"));
        }
    }

    @PostMapping("/demoImage")
    public String uploadImage(@RequestPart(value = "image") MultipartFile file) throws IOException {
        return this.s3Client.uploadImage(file, "demo", "demoFolder", CannedAccessControlList.PublicRead);
    }
}
