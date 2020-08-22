package com.citizens4.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class IndexController {
    
    @GetMapping(value="/")
    public String homePage() {
        return "index";
    }

}