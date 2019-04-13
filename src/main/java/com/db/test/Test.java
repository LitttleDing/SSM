package com.db.test;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping( "/test" )
public class Test {
    @RequestMapping ( "/data" )
    @ResponseBody
    public String data(HttpServletRequest req)
    {
        return "fuck this !";
    }

    @RequestMapping ( "/index" )
    public String index(HttpServletRequest req)
    {
        return "index";
    }

    @RequestMapping ( "/websocket" )
    public String websocket(HttpServletRequest req)
    {
        return "websockettest";
    }


}
