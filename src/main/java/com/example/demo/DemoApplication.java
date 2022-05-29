package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;

@SpringBootApplication
public class DemoApplication implements CommandLineRunner {
	@Autowired
	ApplicationContext applicationContext;



	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}



	@Override
	public void run(String... args) throws Exception {
		OrderedStorage bean = applicationContext.getBean(OrderedStorage.class);
		bean.add(1);
		bean.add(3);
		bean.add(5);
		bean.add(6);
		bean.add(9);
		List<Integer> all = bean.getAll();
		all.forEach(integer -> System.out.println(integer));
	}
}
