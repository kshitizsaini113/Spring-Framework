package com.springcore.constructorInjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("constructorInjectionConfig.xml");

        Person p1 = (Person) context.getBean("person1");
        System.out.println(p1);

        Person p2 = (Person) context.getBean("person2");
        System.out.println(p2);
    }
}
