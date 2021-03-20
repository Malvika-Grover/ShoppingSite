package com.shoppingSite.controller;

import com.shoppingSite.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LoginController {

    @Autowired
    LoginService loginService;


    @RequestMapping("/login")
    public String login() {
        return "login.html";
    }


    @RequestMapping( value = "/submit", method = RequestMethod.POST)
    public String login(@RequestParam String username,
                          @RequestParam String password) {

        Boolean isValidUser = loginService.isValidUser(username, password);

        return "as";
    }



}
