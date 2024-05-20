package com.guilherme.springbootdemo.common;

import org.springframework.stereotype.Component;

@Component
public class SwimCoach implements Coach{



    @Override
    public String getDailyWorkout() {
        return "Crawl swimming for 2 finishes";
    }
}
