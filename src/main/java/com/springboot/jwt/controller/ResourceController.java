package com.springboot.jwt.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ResourceController {

    @RequestMapping ("/")
    public String home() {
        return "<h1>Welcome to Home Page</h1>";
    }

    @RequestMapping ("/user")
    public String user() {
        return "<h1>Welcome User</h1>";
    }

    @RequestMapping ("/admin")
    public String admin() {
        return "<h1>Welcome to User :: Admin</h1>";
    }
}
