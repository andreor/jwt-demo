package com.example.jwt_demo.controllers;

import org.springframework.web.bind.annotation.*;



@RestController
@RequestMapping("/api/test")
public class TestController {


    @GetMapping("/all")
    public String allAccess() {
        return "Public Content.";
    }


    @GetMapping("/user")
    public String userAccess() {
        return "User Content.";
    }
}
