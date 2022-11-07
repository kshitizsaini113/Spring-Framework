package com.springcore.autowire;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("configAutowireXML.xml");

        Employee emp1 = context.getBean("employee1", Employee.class);
        System.out.println(emp1);

//        Employee emp2 = context.getBean("employee2", Employee.class);
//        System.out.println(emp2);

        Employee emp3 = context.getBean("employee3", Employee.class);
        System.out.println(emp3);
    }
}
