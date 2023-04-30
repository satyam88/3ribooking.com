package com.example.booking.com;

import org.springframework.web.bind.annotation.GetMapping;

public class bus {
    @GetMapping("/bus")
    public String getData(){
        return "Please use code flyhigh300 to get discount";
    }
}