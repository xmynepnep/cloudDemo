package com.tzy.controller;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="test")
public class TestController {

    @Value("${server.port}")
    private String port;

    @HystrixCommand(fallbackMethod = "getFallback")
    @RequestMapping(value="getPort")
    public String getPort(){
        int i = 1/0;
        return "i am "+port;
    }

    public String getFallback(){
        String s = port+" 熔断器生效";
        return s;
    }

}
