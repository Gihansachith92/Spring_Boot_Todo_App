package com.app.todoapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootTodoAppApplication {

    public static void main(String[] args) {

        SpringApplication.run(SpringBootTodoAppApplication.class, args);
        System.out.println("Application Started");
    }

}
