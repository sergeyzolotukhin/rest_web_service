package ua.in.szolotukhin.rest.ws.impl;

import ua.in.szolotukhin.rest.ws.api.HelloService;

public class HelloServiceImpl implements HelloService {
    public String sayHello(String name) {
        return String.format("Hello %s, Welcome to CXF RS Spring Boot World!!!", name);
    }
}
