package com.needkk.eurekaservice03;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class EurekaService03Application {

    public static void main(String[] args) {
        SpringApplication.run(EurekaService03Application.class, args);
    }

}
