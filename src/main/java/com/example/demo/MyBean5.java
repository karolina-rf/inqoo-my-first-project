package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MyBean5 {
    @Autowired
    private MyBean1 myBean1;
    @Autowired
    private MyBean22 myBean2;
    @Autowired
    private MyBean3 myBean3;
    @Autowired
    private MyBean4 myBean4;


    public String sayHello (){
        myBean1.MyBean();
        myBean2.MyBean();
        myBean3.MyBean();
        myBean4.MyBean();

        return null;
    }
}
