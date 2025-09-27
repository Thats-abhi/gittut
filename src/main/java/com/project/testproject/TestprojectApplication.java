package com.project.testproject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import com.project.testproject.Calculator;
@SpringBootApplication
public class TestprojectApplication {

	public static void main(String[] args) {
		SpringApplication.run(TestprojectApplication.class, args);
		Calculator c=new Calculator();
		System.out.println(c.sum(10,11));

	}

}
