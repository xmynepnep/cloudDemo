package com.tzy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class Provider06Application {
    public static void main(String[] args) {
        SpringApplication.run(Provider06Application.class, args);
    }
}
