package com.example.demo.service;

import com.example.demo.serviceImpl.HelloServiceImpl;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name = "hello-provider",fallback = HelloServiceImpl.class)
public interface HelloService {

    @RequestMapping("/hello")
    String hello();

    @RequestMapping("/hello2")
    String hello2(@RequestParam("name")String name);
}