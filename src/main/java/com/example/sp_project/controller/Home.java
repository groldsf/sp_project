package com.example.sp_project.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Home {

    @GetMapping
    public String hello(){
        return "hello word";
    }

}
