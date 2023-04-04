package com.ex.booksworld;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;

@EnableWebSecurity
@SpringBootApplication(exclude = {SecurityAutoConfiguration.class })
//@EnableAutoConfiguration
public class BooksWorldApplication {

    public static void main(String[] args) {
        SpringApplication.run(BooksWorldApplication.class, args);
    }

}
