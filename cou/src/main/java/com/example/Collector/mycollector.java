package com.example.Collector;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.netflix.eureka.EurekaDiscoveryClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class mycollector {
    @Autowired
    EurekaDiscoveryClient client;
    @RequestMapping("/test")
    public String test(){
        List<String> services =client.getServices();
        if (services!=null){
            System.out.println(services);
        }
        return null;
    }
}
