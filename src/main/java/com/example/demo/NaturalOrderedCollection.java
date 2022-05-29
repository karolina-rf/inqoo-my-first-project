package com.example.demo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;


@Component
public class BeanCollection {

    @Bean
    public BeanCollection beanCollection(){
        return beanCollection();
    }

    @Bean
    public List<Integer> nameList(){
        return Arrays.asList(1,3,5);
    }
}
