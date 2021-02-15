package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {


    public static void main(String[] args) {


        SpringApplication.run(Application.class, args);
        Application application = new Application();

        application.cheer("the 3D boiiiiiiiiiiis");
        System.out.println(application.count());
        System.out.println(application.greet("Varga György"));

        application.cheer("java");
        System.out.println(application.count());
        System.out.println(application.greet("Greeting!"));


    }

    public Integer count (){
        return 5;

    }

    public void cheer(String teamName) {
        System.out.println(teamName);
    }

    public String greet(String name){
        return name;
    }
}
