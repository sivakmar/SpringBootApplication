package com.springboot.SpringBootApplication.common;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class CricketCoach implements Coach {
    @Override
    public String getDailyWorkout() {
        return "Do 15 minutes of running!";
    }

    public CricketCoach() {
        System.out.println("In constructor CricketCoach");
    }
}
