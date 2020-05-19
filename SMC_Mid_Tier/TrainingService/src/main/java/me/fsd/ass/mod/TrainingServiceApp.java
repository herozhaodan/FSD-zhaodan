package me.fsd.ass.mod;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class TrainingServiceApp {
    public static void main(String[] args) {
        SpringApplication.run(TrainingServiceApp.class, args);
    }
}
