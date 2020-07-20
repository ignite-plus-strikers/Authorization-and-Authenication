package com.oauth2.example.demooauth;

import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ControllerClass {

    @GetMapping("/")
    public String hello() {
        return "Hello World!";
    }

//    @GetMapping("/restricted")
//    public String restricted() {
//        return "Can be seen only on successful authentication";
//    }

    @GetMapping("/admin")
    @ResponseBody
    public String currentAdmin(Authentication authentication) {
        if (authentication.getName().equals("Token")) {
            return "Welcome Admin";
        }
       else {
           return "Invalid";
        }
    }
    @GetMapping("/scorer")
    @ResponseBody
    public String currentScorer(Authentication authentication) {
        if (authentication.getName().equals("116362528129737730570")) {
            return "Welcome Scorer";
        }
        else {
            return "Invalid";
        }
    }



}
