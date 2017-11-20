package com.db.axis2.impl;

import com.db.axis2.IService;

public class ServiceImpl implements IService{
    @Override
    public String sayHello(String name) {
        return "Hello "+ name;
    }
}
