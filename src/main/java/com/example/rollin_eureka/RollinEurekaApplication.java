package com.example.rollin_eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class RollinEurekaApplication {

    public static void main(String[] args) {
        SpringApplication.run(RollinEurekaApplication.class, args);
    }

}
