package com.springboot.SpringBootApplication.config;

import com.springboot.SpringBootApplication.common.Coach;
import com.springboot.SpringBootApplication.common.SwimCoach;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SportConfig {

    @Bean
    public Coach swimCoach(){
        return new SwimCoach();
    }
}
