package com.pinnacle.ipl;

import org.springframework.web.bind.annotation.RestController;


import org.springframework.web.bind.annotation.RequestMapping;


@RestController
public class HomeController {
    
    @RequestMapping(value="/")
    public String getHome() {
        return "All okay, Everything Okay..!";
    }
    
}
