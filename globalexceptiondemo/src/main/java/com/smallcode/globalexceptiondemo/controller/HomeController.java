package com.smallcode.globalexceptiondemo.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @GetMapping(value = "/test")
    public String test(){
        return "test123131dd2";
    }

    @GetMapping(value = "/test2")
    public String test2() throws Exception {
        throw new Exception("d");
    }
}
