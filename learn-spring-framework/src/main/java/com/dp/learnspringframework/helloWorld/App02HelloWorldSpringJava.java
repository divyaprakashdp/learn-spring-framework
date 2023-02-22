package com.dp.learnspringframework.helloWorld;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App02HelloWorldSpringJava {

    public static void main(String[] args) {
        //1. Create Spring Context
        //moved context inside try to close it gracefully
        try(var context = new AnnotationConfigApplicationContext(HelloWorldConfiguration.class)){
            //2. Configure things that we want spring to manage ->@Configuration
            System.out.println(context.getBean("name"));
            System.out.println(context.getBean("age"));
            System.out.println(context.getBean(Person.class));
            System.out.println(context.getBean("address"));
        }


    }


}
