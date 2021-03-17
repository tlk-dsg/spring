package com.tlk.config;

import com.tlk.pojo.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.tlk.pojo")
public class AppConfig {

    @Bean
    public User getUser(){
        return new User();
    }
}
