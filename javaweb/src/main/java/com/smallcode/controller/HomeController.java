package com.smallcode.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by Lenny on 2017/8/2.
 */
@Controller
@RequestMapping("/home")
public class HomeController {

    @RequestMapping("/index")
    @ResponseBody
    public String index(){
        return "demo";
    }
}
