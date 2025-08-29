package com.kafka.springboot.producer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootProducerApplication implements CommandLineRunner {

    @Autowired
    private Producer producer;

    public static void main(String[] args) {
        System.out.println("Application started....");
        SpringApplication.run(SpringBootProducerApplication.class);

    }

    @Override
    public void run(String... args) throws InterruptedException {
        producer.sendMessage();
    }

}
