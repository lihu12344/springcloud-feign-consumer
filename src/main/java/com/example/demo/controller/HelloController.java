package com.example.demo.controller;

import com.example.demo.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @Autowired
    private HelloService helloService;

    @RequestMapping("/get")
    public String hello(){
        return helloService.hello();
    }

    @RequestMapping("/get2")
    public String hello2(@RequestParam("name")String name){
        return helloService.hello2(name);
    }
}
