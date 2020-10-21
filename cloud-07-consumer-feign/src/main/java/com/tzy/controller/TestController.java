package com.tzy.controller;

import com.tzy.service.FeignTestService;
import com.tzy.service.HystrixService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping
@RestController
public class TestController {

    @Autowired
    FeignTestService feignTestService;

    @Autowired
    HystrixService hystrixService;

    @RequestMapping(value="test")
    public String test(){
        return "test";
    }

    @RequestMapping(value="feignGetPort")
    public String feignGetPort(){
        String result = feignTestService.getPort();
        String s = "feign : " + result;
        return s;
    }

    @RequestMapping(value="feignGetPortyHystrix")
    public String feignGetPortHystrix(){
        String result = hystrixService.getPort();
        String s = "feign : " + result;
        return s;
    }
}
