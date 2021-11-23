package com.momo.data;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "com.momo.data")
public class MomoApplication {

    public static void main(String[] args) {
        SpringApplication.run(MomoApplication.class, args);
    }

}
