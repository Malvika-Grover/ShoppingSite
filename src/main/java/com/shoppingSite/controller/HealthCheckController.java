package com.shoppingSite.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HealthCheckController {


    @GetMapping("/")
    public String home(){
        return "Welcome";
    }
    
    @GetMapping("/admin")
    public String admin(){
        return "Hello Admin";
    }

    @GetMapping("/user")
    public String user(){
        return "Hello User";
    }
}
