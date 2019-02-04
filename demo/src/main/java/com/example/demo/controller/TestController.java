package com.example.demo.controller;

import com.example.demo.property.DemoProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @Autowired
    private DemoProperties properties;

    @GetMapping("/name")
    public String getName(){
        return properties.getCountry();
    }

}
