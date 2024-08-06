package com.springboot.SpringBootApplication.common;

import org.springframework.stereotype.Component;

@Component
public class TrackCoach implements Coach{
    @Override
    public String getDailyWorkout() {
        return "Run 100 Km!";
    }
}
