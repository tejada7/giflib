package com.ftm.giflib.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class GifController {
    @RequestMapping("/") // Links to the application's root or homepage
    public String listGifs() {
        return "home"; // As the HTML file located resources/templates is named home.html
    }

    @RequestMapping("/gif")
    @ResponseBody
    public String getSpecificGif() {
        return "<h1>This should display one single gif</h1>";
    }
}
