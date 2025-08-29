package com.kafka.springboot.consumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootConsumerApplication {

    public static void main(String[] args) {
        System.out.println("Consumer Started...");
        SpringApplication.run(SpringBootConsumerApplication.class);
    }
}
