package com.springboot.SpringBootApplication.common;

import org.springframework.stereotype.Component;

@Component
public class CricketCoach implements Coach {
    @Override
    public String getDailyWorkout() {
        return "Do 15 minutes of running!";
    }

    public CricketCoach() {
        System.out.println("In constructor CricketCoach");
    }
}
