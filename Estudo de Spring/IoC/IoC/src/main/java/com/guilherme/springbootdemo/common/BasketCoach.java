package com.guilherme.springbootdemo.common;

import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
public class BasketCoach implements Coach{
    public BasketCoach(){
        System.out.println("In Constructor: " + getClass().getSimpleName());
    }

    @Override
    public String getDailyWorkout() {
        return "Throw the basketball to make a chest for 30 minutes";
    }
}
