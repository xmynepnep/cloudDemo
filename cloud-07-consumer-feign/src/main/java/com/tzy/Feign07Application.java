package com.tzy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@EnableEurekaClient //标识Eureka客户端
@SpringBootApplication
public class Feign07Application {
    public static void main(String[] args) {
        SpringApplication.run(Feign07Application.class, args);
    }
}
