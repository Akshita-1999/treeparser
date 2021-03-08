package com.example.alienjpa;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages="com.example")
public class AlienjpaApplication {

    public static void main(String[] args) {
        SpringApplication.run(AlienjpaApplication.class, args);
    }

}
