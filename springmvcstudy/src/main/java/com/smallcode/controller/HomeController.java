package com.smallcode.controller;

import com.smallcode.bean.ResultMessage;
import org.springframework.stereotype.Controller;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
public class HomeController {

    @GetMapping(path = "index")
    @ResponseBody
    public ResultMessage index() {
        String s = "dd,ddds:asdasd;asdd asdddd";
        String[] result = StringUtils.tokenizeToStringArray(s, ",; ");
        return new ResultMessage();
    }
}
