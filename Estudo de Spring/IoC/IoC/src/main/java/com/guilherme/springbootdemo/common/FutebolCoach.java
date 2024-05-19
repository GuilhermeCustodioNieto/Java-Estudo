package com.guilherme.springbootdemo.common;

import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
public class FutebolCoach implements Coach {
    public FutebolCoach(){
        System.out.println("In Constructor: " + getClass().getSimpleName());
    }

    @Override
    public String getDailyWorkout() {
        return  "Fazer embaixadinha até o pé cair";
    }
}
