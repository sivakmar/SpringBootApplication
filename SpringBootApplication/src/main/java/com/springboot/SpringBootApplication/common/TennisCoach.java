package com.springboot.SpringBootApplication.common;

import org.springframework.stereotype.Component;

@Component
public class TennisCoach implements Coach{
    @Override
    public String getDailyWorkout() {
        return "Do 15 minutes of Swinging!";
    }

    public TennisCoach() {
        System.out.println("In constructor TennisCoach");
    }
}
