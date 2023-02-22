package com.dp.learnspringframework.helloWorld;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

record Person(String name, int age){};
record Address(String firstLine, String city){};
@Configuration
public class HelloWorldConfiguration {
    @Bean
    public String name(){
        return "DP";
    }

    @Bean
    public int age(){
        return 30;
    }

    @Bean(name = "CM")
    public Person sam(){
        return new Person("Sam", 23);
    }

    @Bean
    public Address address(){
        return new Address("1 Ane Marg", "Patna");
    }

    @Bean(name = "CM")
    public Person ram(){
        return new Person("Ram", 16);
    }

}
