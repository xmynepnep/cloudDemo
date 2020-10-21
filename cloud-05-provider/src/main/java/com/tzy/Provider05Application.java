package com.tzy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class Provider05Application {
    public static void main(String[] args) {
        SpringApplication.run(Provider05Application.class, args);
    }
}
