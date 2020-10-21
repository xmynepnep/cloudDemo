package com.tzy.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(value="product-other")
public interface FeignTestService {

    @RequestMapping(value = "/test/getPort",method = RequestMethod.POST)
    public String getPort();

}
