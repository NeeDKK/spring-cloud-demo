package com.needkk.eurekaservice04;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class EurekaService04Application {

    public static void main(String[] args) {
        SpringApplication.run(EurekaService04Application.class, args);
    }

}
