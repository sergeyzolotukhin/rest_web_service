package ua.in.szolotukhin.rs.ws.service.impl;

import ua.in.szolotukhin.rs.ws.service.api.HelloService;

public class HelloServiceImpl implements HelloService {
    public String sayHello(String name) {
        return String.format("Hello %s, Welcome to CXF RS Spring Boot World!!!", name);
    }
}
