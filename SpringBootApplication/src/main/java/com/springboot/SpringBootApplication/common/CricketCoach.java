package com.springboot.SpringBootApplication.common;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
//@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class CricketCoach implements Coach {

    /*@PostConstruct
    public void doMyStartupStuff(){
        System.out.println("In doMyStartypStuff "+getClass().getSimpleName());
    }

    @PreDestroy
    public void doMyCleanupStuff(){
        System.out.println("In doMyEndStuff "+ getClass().getSimpleName());
    }*/

    @Override
    public String getDailyWorkout() {
        return "Do 15 minutes of running!";
    }

    public CricketCoach() {
        System.out.println("In constructor CricketCoach");
    }
}
