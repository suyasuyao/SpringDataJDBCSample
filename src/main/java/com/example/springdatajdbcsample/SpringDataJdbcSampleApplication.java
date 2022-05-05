package com.example.springdatajdbcsample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringDataJdbcSampleApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringDataJdbcSampleApplication.class, args);

        SpringDataJdbcSampleApplication springApplication = new SpringDataJdbcSampleApplication();
        springApplication.hello();
    }

    private void hello(){
        System.out.println("==================Hello world==================");
    }

}
