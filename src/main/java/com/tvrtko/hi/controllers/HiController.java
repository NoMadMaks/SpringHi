package com.tvrtko.hi.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HiController {
    
    @GetMapping(value = "/hey")
    public String SayHi(String name) {
        if (name == null)
        return "Hey man/woman";
        else
        return "Hey " + name + "!";
    }

}
