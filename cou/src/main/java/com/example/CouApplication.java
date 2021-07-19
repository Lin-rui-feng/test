package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
public class CouApplication {
    public static void main(String[] args) {
        SpringApplication.run(CouApplication.class, args);
    }

}
