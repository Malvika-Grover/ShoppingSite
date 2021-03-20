package com.shoppingSite.controller;

import com.shoppingSite.service.LoginService;
import org.apache.tomcat.util.codec.binary.Base64;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.net.http.HttpHeaders;
import java.nio.charset.Charset;

import static com.sun.tools.sjavac.Util.set;

@Controller
public class LoginController {

    @Autowired
    LoginService loginService;


    @RequestMapping("/login")
    public String login() {
        return "login.html";
    }


    @RequestMapping( value = "/submit", method = RequestMethod.POST)
    public Boolean login(@RequestParam String username,
                          @RequestParam String password) {

        Boolean isValidUser = loginService.isValidUser(username, password);
        if (true == isValidUser){
                    String auth = username + ":" + password;
                    byte[] encodedAuth = Base64.encodeBase64(
                            auth.getBytes(Charset.forName("US-ASCII")) );
                    String authHeader = "Basic " + new String( encodedAuth );
                    try {
                        set( "Authorization", authHeader );
                    }
                    catch (Exception e){
                        return false;
                    }
                    return true;

                }
        return false;
        }

    }

