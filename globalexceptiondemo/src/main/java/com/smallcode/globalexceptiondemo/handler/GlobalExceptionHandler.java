package com.smallcode.globalexceptiondemo.handler;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

@ControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(value = Exception.class)
    @ResponseBody
    public ReturnResult<String> jsonErrorHandler(HttpServletRequest req, Exception e) throws Exception {
        ReturnResult<String> r = new ReturnResult<>();
        r.setMessage(e.getMessage());
        r.setCode(ReturnResult.ERROR);
        r.setData("Some Data");
        r.setUrl(req.getRequestURL().toString());
        return r;
    }

}