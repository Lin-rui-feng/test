package com.example.provier;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class mycollector {
    @RequestMapping("/test")
    public String test(){
        return "ok";
    }
}
