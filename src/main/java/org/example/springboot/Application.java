package org.example.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

//@EnableJpaAuditing      //JPA Auditing 활성화
@SpringBootApplication
public class Application {
    public static void main(String[] args){

        System.out.println("SpringRun" + args);
        SpringApplication.run(Application.class, args);

    }
}

A