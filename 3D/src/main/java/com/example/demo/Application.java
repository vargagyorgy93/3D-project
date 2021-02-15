package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {


    public static void main(String[] args) {

        SpringApplication.run(Application.class, args);
        Application application = new Application();

        System.out.println(application.cheer());
        System.out.println(application.greet());
    }

    public String cheer() {
        return "the 3D boiiis";
    }

    public String greet(){
        return "Varga György";
    }


}
