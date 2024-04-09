package com.example.controllerexample;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Rest2Controller {

    @GetMapping(path = "/test")
    public String health(){
        return "message from health api";
    }
}
