package com.shoppingSite.controller;

import com.shoppingSite.service.LoginService;
import org.apache.tomcat.util.codec.binary.Base64;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.nio.charset.Charset;


@Controller
public class LoginController {

    @Autowired
    LoginService loginService;


    @RequestMapping(value = "/login" , method = RequestMethod.GET)
    public String login() {
        return "login";
    }
/*
    @RequestMapping(value = "/register" , method = RequestMethod.GET)
    public ModelAndView register() {
        ModelAndView modelAndView=new ModelAndView();
        modelAndView.setViewName("home");
        return modelAndView;
    }

    @RequestMapping(value = "/home" , method = RequestMethod.GET)
    public ModelAndView home() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("home");
        return modelAndView;
    }

    @RequestMapping( value = "/submit", method = RequestMethod.POST)
    public String login(@RequestParam String username,
                          @RequestParam String password) {

        Boolean isValidUser = loginService.isValidUser(username, password);
        if (true == isValidUser){
                    String auth = username + ":" + password;
                    byte[] encodedAuth = Base64.encodeBase64(
                            auth.getBytes(Charset.forName("US-ASCII")) );
                    String authHeader =  new String( encodedAuth );
                    return authHeader;
                }
        return null;

        }
*/
    }

