package com.tvrtko.hi.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestParam;

@RestController
public class HiController {
    
    @GetMapping(value = "/hey")
    public String SayHi(@RequestParam(defaultValue = "") String name) {
            return "Hey " + name + "!";   
    }
}