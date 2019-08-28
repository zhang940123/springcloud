package com.example.consumers.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class HelloService {
    @Autowired
    RestTemplate restTemplate;

    public String hiService(String name)
    {
         ResponseEntity<Object> forEntity =  restTemplate.getForEntity("http://SERVICE-HI/hi?name=" + name, Object.class);
         Object forObject = restTemplate.getForObject("http://SERVICE-HI/hi?name=" + name, Object.class);
         return "";
    }
    public String hierror(String name){
        return "hey"+name+", there is some problem with hi page";
    }


}
