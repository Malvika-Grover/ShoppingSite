package com.shoppingSite.controller;

import com.shoppingSite.servce.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoginController {

    @Autowired
    LoginService loginService;

    @RequestMapping( value = "/login", method = RequestMethod.GET)
    public  String login (){
        return "login.html";
    }

    @RequestMapping( value = "/submit", method = RequestMethod.POST)
    public String login(@RequestParam String username,
                          @RequestParam String password) {

        Boolean isValidUser = loginService.isValidUser(username, password);

        return "as";
    }



}
