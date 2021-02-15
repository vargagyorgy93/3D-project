package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {


    public static void main(String[] args) {

        SpringApplication.run(Application.class, args);
        Application application = new Application();
        System.out.println(application.count());
    }

    public Integer count (){
        return 5000;
    }

}
