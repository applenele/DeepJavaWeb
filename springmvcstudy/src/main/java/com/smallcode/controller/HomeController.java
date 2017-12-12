package com.smallcode.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by Lenny on 2017/12/11.
 */
@Controller
public class HomeController {

    @GetMapping(path = "index")
    @ResponseBody
    public String index() {
        return "index";
    }
}
