package com.springboot.SpringBootApplication.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SampleController {


    @Value("${team.coach}")
    private String coach;

    @Value("${team.name}")
    private String team;
    @GetMapping
    public String helloWorld()
    {
        return "Hello World";
    }
    @GetMapping("/coach")
    public String getCoach()
    {
        return coach;
    }
    @GetMapping("/team")
    public String getTeam()
    {
        return team;
    }
}
