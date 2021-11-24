package com.test.springbootdocker.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Demo {

    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    @GetMapping("/getMessage")
    public String getMessage(){
        int count =1;
        for(int i=0;i<10;i++) {
            logger.info("count value : "+count);
            count++;
        }
        return "shashidhar";
    }

    @GetMapping("/getError")
    public String getError(){
        int x = 10/0;
        logger.info("x value : "+x);
        return "shashidhar";
    }
}
