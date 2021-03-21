package com.shoppingSite.controller;

import com.shoppingSite.service.LoginService;
import org.apache.tomcat.util.codec.binary.Base64;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.nio.charset.Charset;


@Controller
public class LoginController {

    @Autowired
    LoginService loginService;


    // API to redirect to login
    @RequestMapping("/")
    public String login() {
        return "login.html";
    }


    @RequestMapping(value = "/submit", method = RequestMethod.POST)
    public String login(@RequestParam String username,
                        @RequestParam String password) {

        Boolean isValidUser = loginService.isValidUser(username, password);
        if (true == isValidUser) {
            String auth = username + ":" + password;
            byte[] encodedAuth = Base64.encodeBase64(
                    auth.getBytes(Charset.forName("US-ASCII")));
            String authHeader = new String(encodedAuth);
            return authHeader;
        }
        return null;

    }

    // API to add user to Database
    @RequestMapping(value = "/addUser", method = RequestMethod.POST)
    public Boolean addUser() {
        return null;
    }
}

