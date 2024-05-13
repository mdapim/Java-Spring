package com.springtutorial.demo.demoapp.rest;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController // specify it's a controller
public class DemoRestController {

    @Value("${activity.name}")
    private String activityName;

    @Value("${activity.time}")
    private String activityTime;

    @GetMapping("/")     // map requests based on endpoints defined
    public String sayHello(){
        return "Hello you!!!!";
    }

    @GetMapping("/dev")
    public String sayDev(){
        return "Dev Tools is up and running!!!";
    }


    @GetMapping("/workout")
    public String workout(){
        return "Run 1k today!!!" + activityName + " " + activityTime;
    }

}
