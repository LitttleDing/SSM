package com.db.cxf;

import javax.jws.WebService;

@WebService
public interface IHelloService {
    public String sayHi(String name);
}
