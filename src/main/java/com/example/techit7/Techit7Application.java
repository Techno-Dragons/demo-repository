package com.example.techit7;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class Techit7Application {

    public static void main(String[] args) {
        SpringApplication.run(Techit7Application.class, args);
    }

}