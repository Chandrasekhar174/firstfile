package org.example;


import org.example.MyObject.Mail;
import org.springframework.context.annotation.Bean;

@org.springframework.context.annotation.Configuration
public class Configuration {
    @Bean
    public Mail myObject() {
        String name = "Chandrasekha sahu";
        int age = 23;
        return new Mail(name, age);
    }
}
