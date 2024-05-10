package com.guilherme.springboot.demo.mycoolapp.rest;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FunRestController {

    @Value("${dev.name}")
    private String devName;

    @GetMapping("/")
    public String sayHello(){
        return "Hello, world \n " + devName;
    }

    @GetMapping("/workout")
    public String workout(){
        return "Workout's really hard";
    }

    @GetMapping("/fortune")
    public String getDailyFortune() {
        return "Today is a lucky day";
    }
}
