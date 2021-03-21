package com.shoppingSite.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HealthCheckController {


    @GetMapping("/")
    public String home(){
        return "<h1>welcome</h1>";
    }
    
    @GetMapping("/admin")
    public String admin(){
        return "<h1>hello admin</h1>";
    }

    @GetMapping("/user")
    public String user(){
        return "<h1>hello user</h1>";
    }
}
