package com.example.feign.testfeign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient(value = "service-ribbon")
public interface FeignDemo {
    @RequestMapping("/hi")
    String hello();
}
