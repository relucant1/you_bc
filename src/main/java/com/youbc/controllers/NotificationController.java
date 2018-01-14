package com.youbc.controllers;

import com.youbc.database.UserDAO;
import com.youbc.utilities.Endpoints;
import org.jooq.Record;
import org.jooq.Result;
import org.jooq.tools.json.JSONArray;
import org.jooq.tools.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

@RestController
public class NotificationController {

    private UserDAO userDAO;

    @Autowired
    public NotificationController(UserDAO userDAO) {
        this.userDAO = userDAO;
    }

}
