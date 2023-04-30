package com.example.booking.com;

import org.springframework.web.bind.annotation.GetMapping;

public class visa {
    @GetMapping("/visa")
    public String getData(){
        return "Please use code flyhigh300 to get discount";
    }
}