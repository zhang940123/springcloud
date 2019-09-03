package com.example.feign.Controller;

import com.example.feign.testfeign.FeignDemo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @Autowired
    private FeignDemo feignDemo;

    @RequestMapping(value = "/sayHello")
    public String hello(){
        return feignDemo.hello();
    }
}
