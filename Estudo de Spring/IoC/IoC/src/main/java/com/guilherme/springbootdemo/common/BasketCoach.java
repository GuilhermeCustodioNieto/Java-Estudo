package com.guilherme.springbootdemo.common;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class BasketCoach implements Coach{
    @Override
    public String getDailyWorkout() {
        return "Throw the basketball to make a chest for 30 minutes";
    }
}
