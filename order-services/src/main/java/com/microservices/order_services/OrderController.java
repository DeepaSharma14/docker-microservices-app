package com.microservices.user_services.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/orders")
public class OrderController {

    @GetMapping("/{id}")
    public String getOrder(@PathVariable String id) {
         return "Order " + id + " for " + restTemplate.getForObject(
        "http://user-service:8081/users/1",
        String.class
    }

    @Bean
public RestTemplate restTemplate() {
    return new RestTemplate();
}
}




