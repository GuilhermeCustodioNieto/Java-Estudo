package com.guilherme.springbootdemo;

import org.springframework.stereotype.Component;

@Component
public class FutebolCoach implements Coach{

    @Override
    public String getDailyWorkout() {
        return  "Fazer embaixadinha até o pé cair";
    }
}
