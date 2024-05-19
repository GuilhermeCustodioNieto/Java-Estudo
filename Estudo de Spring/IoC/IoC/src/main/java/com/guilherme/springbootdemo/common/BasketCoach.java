package com.guilherme.springbootdemo.common;

import org.springframework.stereotype.Component;

@Component
public class BasketCoach implements Coach{
    @Override
    public String getDailyWorkout() {
        return "Throw the basketball to make a chest for 30 minutes";
    }
}
