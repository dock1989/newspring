package com.example.newspring.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FirstRestController {

    @GetMapping(path = "/check")
    public String check(){
        return "Working fine!";
    }

}
