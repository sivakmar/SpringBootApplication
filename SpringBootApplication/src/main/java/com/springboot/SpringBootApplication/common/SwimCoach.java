package com.springboot.SpringBootApplication.common;

public class SwimCoach implements Coach{

    public SwimCoach() {
        System.out.println("In Constructor: "+getClass().getSimpleName());
    }

    @Override
    public String getDailyWorkout() {
        return "Do Some Warmup";
    }
}
