package com.example.demo.serviceImpl;

import com.example.demo.service.HelloService;
import org.springframework.stereotype.Service;

@Service
public class HelloServiceImpl implements HelloService {

    @Override
    public String hello() {
        return "默认 hello world";
    }

    @Override
    public String hello2(String name) {
        return "默认 "+name;
    }
}
