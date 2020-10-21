package com.tzy.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class TestController {

    @Autowired
    private RestTemplate restTemplate;

    private static final String REST_URL_PREFIX = "http://product-01/";
    private static final String REST_URL_PREFIX_OTHER = "http://product-other/";

    @RequestMapping(value="test")
    public String test(){
        return "test";
    }

    @RequestMapping(value="postCommon")
    public String postCommon(){
        String url = REST_URL_PREFIX + "test/getPort";
        String result = restTemplate.postForObject(url,null,String.class);
        return result;
    }

    @RequestMapping(value="postOther")
    public String postOther(){
        String url = REST_URL_PREFIX_OTHER + "test/getPort";
        String result = restTemplate.postForObject(url,null,String.class);
        return result;
    }


}
