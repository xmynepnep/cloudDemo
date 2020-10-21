package com.tzy.service.impl;

import com.tzy.service.HystrixService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class HystrixServiceImpl implements HystrixService {

    @Value("${server.port}")
    private String port;

    @Override
    public String getPort() {
        return port+"客户端的熔断器生效，随便返回点东西";
    }
}
