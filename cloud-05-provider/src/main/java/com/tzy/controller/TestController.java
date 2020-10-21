package com.tzy.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="test")
public class TestController {

    @Value("${server.port}")
    private String port;

    @RequestMapping(value="getPort")
    public String getPort(){
        return "i am "+port;
    }

}
