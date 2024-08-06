package com.springboot.SpringBootApplication.controller;

import com.springboot.SpringBootApplication.common.Coach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SampleController {


    @Value("${team.coach}")
    private String coach;
    @Value("${team.name}")
    private String team;

    private Coach myCoach;
    private Coach myAnotherCoach;

    @Autowired
    public  SampleController(@Qualifier("cricketCoach") Coach theCoach,
                             @Qualifier("cricketCoach") Coach anotherCoach){
        myCoach=theCoach;
        myAnotherCoach=anotherCoach;
    }

    @GetMapping
    public String helloWorld() {
        return "Hello World";
    }
    @GetMapping("/coach")
    public String getCoach() {
        return coach;
    }
    @GetMapping("/team")
    public String getTeam() {
        return team;
    }
    @GetMapping("/getdailyworkout")
    public String getDailyWorkout(){
        return myCoach.getDailyWorkout();
    }

    @GetMapping("/check")
    public String checkBeans(){
        return "Comparing beans myCoach==anotherCoach "+ (myCoach==myAnotherCoach);
    }
}
