package com.springtutorial.demo.demoapp.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController // specify it's a controller
public class DemoREstController {

    @GetMapping("/")     // map requests based on endpoints defined
    public String sayHello(){
        return "Hello you!!!!";
    }

}
