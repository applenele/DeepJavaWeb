package com.smallcode.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
public class HomeController {

    @GetMapping(path = "index")
    @ResponseBody
    public String index() {
        return "index";
    }
}
