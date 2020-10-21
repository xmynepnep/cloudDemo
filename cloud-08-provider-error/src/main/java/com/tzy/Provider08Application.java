package com.tzy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;

@EnableHystrix
@SpringBootApplication
@EnableEurekaClient
public class Provider08Application {
    public static void main(String[] args) {
        SpringApplication.run(Provider08Application.class, args);
    }
}
