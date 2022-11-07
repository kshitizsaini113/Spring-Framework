package com.springcore.beanLifecycle;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {
        AbstractApplicationContext context = new ClassPathXmlApplicationContext("beanLefecycleXml.xml");
        Samosa samosa1 = (Samosa) context.getBean("samosa1");

        context.registerShutdownHook();
    }
}
