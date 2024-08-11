package com.example.Shree.Murli.Gulacha.Chaha.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AllControllers {

    @GetMapping("/")
    public String Homepage(){
        return "index";
    }
}
