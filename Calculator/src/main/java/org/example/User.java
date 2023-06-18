package org.example;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class User {

    @Bean("Check")
    public Substraction sub()
    {
        System.out.print("hello");
        return new Substraction(23,14);
    }


}
