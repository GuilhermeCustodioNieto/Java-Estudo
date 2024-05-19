package com.guilherme.springbootdemo.common;

import org.springframework.stereotype.Component;

@Component
public class VoleiCoach implements Coach{

    public VoleiCoach(){
        System.out.println("In Constructor: " + getClass().getSimpleName());
    }
    @Override
    public String getDailyWorkout() {
        return "Throw the ball over the volleyball net";
    }
}
