package com.ftm.giflib.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class ErrorController {

    @RequestMapping(value = "/error1")
    @ResponseBody
    public String showErrorMessage() {
        return "<h1>Page not found</h1>";
    }
}
