package com.example.coumouer;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.xml.ws.RequestWrapper;

@RestController
public class coll {
    @RequestMapping("/test")
    public String test(){
        return "ok";
    }
}
