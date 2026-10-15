package com.apress.crm.customer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.springframework.boot.Banner;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
@SpringBootApplication
public class CustomerApplication {
    public static void main(String[] args) {
        new SpringApplicationBuilder(CustomerApplication.class)
                //.bannerMode(Banner.Mode.OFF)
                .logStartupInfo(true)
                .run(args);
    }
}
