package com.ravi.springcloud.springweb.com.ravi.springcloud.springweb.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloWorldController {

    @GetMapping("/")
    public String getView(Model model){
        return "hello";
    }
}
