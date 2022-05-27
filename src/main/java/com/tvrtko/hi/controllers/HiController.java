package com.tvrtko.hi.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestParam;

@RestController
public class HiController {
    
    @GetMapping(value = "/hey")
    public String SayHi(@RequestParam String name) {
        return "Hey " + name + "!";
    }

    @GetMapping(value = "/hey1")
    public String SayHi1(String name) {
        if (name == null)
        return "Hey man/woman";
        else
        return "Hey " + name + "!";
    }
}