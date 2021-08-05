package com.test.springbootdocker.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Demo {

    @GetMapping("/getMessage")
    public String getMessage(){
        return "shashidhar";
    }
}
