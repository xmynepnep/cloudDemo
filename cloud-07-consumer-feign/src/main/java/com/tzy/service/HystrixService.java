package com.tzy.service;

import com.tzy.service.impl.HystrixServiceImpl;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(value="product-other",fallback = HystrixServiceImpl.class)
public interface HystrixService {

    @RequestMapping(value = "/test/getPort",method = RequestMethod.POST)
    public String getPort();

}
