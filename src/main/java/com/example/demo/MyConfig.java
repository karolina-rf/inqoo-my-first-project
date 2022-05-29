package com.example.demo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
class MyConfig {

    @Bean
    MyBean22 myBean2(){
        return new MyBean22();
    }
}
