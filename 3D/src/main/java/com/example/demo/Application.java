package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {


    public static void main(String[] args) {


        SpringApplication.run(Application.class, args);
        Application application = new Application();



<<<<<<< HEAD
        application.cheer("the 3D boiiiiiiiiiiis");
        System.out.println(application.count());
        System.out.println(application.greet("Varga György"));
=======
        application.cheer("java");
        System.out.println(application.count(5000));
        System.out.println(application.greet("Greeting!"));
>>>>>>> cbe0ffffbe7d5fb9c6fe4f57ba7727eca664f726

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
