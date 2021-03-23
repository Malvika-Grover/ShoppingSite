package com.shoppingSite.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HealthCheckController {


    // Welcome message for Public
    @GetMapping("/")
    public String home(){
        return "Welcome";
    }

    // Welcome message for Admin
    @GetMapping("/admin")
    public String admin(){
        return "Hello Admin";
    }

    // Welcome message for User
    @GetMapping("/user")
    public String user(){
        return "Hello User";
    }
}
