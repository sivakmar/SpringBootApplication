package com.springboot.SpringBootApplication.common;

import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
@Lazy
public class BaseballCoach implements Coach{
    @Override
    public String getDailyWorkout() {
        return "Do 15 minutes of Batting!";
    }

    public BaseballCoach() {
        System.out.println("In constructor BaseBallCoach");
    }
}
