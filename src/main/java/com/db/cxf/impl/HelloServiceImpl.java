package com.db.cxf.impl;

import com.db.cxf.IHelloService;

import javax.jws.WebService;


@WebService(endpointInterface = "com.db.cxf.IHelloService")
public class HelloServiceImpl implements IHelloService {
    @Override
    public String sayHi(String name) {
        return "hello " + name;
    }
}
