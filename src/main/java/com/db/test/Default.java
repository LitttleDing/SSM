package com.db.test;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Default {

    @RequestMapping( "/index" )
    public String index(){
        return "index";
    }
}
