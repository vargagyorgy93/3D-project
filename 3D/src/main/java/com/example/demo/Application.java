package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {


    public static void main(String[] args) {
        
        SpringApplication.run(Application.class, args);
        Application application = new Application();


        System.out.println(application.count(60, 2021));
        System.out.println(application.greet("Greeting!", "Male"));


    }

    public Integer count (Integer age, Integer year){
        return count(age, year);

    }

    public void cheer(String teamName) {
        System.out.println(teamName);
    }

    public String greet(String name, String gender){
        return name + " " + gender;
    }
}
