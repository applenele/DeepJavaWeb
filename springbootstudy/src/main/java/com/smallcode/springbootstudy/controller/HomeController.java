package com.smallcode.springbootstudy.controller;

import com.smallcode.doctorstarter.service.RegisterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Lenny on 2017/12/25.
 */
@RestController
public class HomeController {

    @Autowired
    private RegisterService registerService;

    @GetMapping("/index")
    public String index() {
        return "hello world";
    }

    @GetMapping("/index1")
    public String index1() {
        return "hello world";
    }

    @GetMapping("/addRegister")
    public String addRegister() {
        registerService.add();
        return "ok";
    }

}
