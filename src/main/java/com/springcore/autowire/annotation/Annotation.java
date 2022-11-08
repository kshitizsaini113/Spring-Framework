package com.springcore.autowire.annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Annotation {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("configAutowireAnnotation.xml");
        Employee employee = context.getBean("employee", Employee.class);
        System.out.println(employee);
    }
}
