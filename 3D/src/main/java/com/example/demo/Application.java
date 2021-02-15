package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {


    public static void main(String[] args) {


        SpringApplication.run(Application.class, args);
        Application application = new Application();

        application.cheer("java","monday");
        System.out.println(application.count());
        System.out.println(application.greet("Greeting!", "Male"));



    }

    public Integer count (){
        return 5;

    }

    public void cheer(String teamName, String weekday) {
        System.out.println(teamName);
    }

    public String greet(String name, String gender){
        return name + " " + gender;
    }
}
