package com.springcore;

import com.springcore.collections.Teacher;
import com.springcore.reference.A;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );

        ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
        Student student1 = (Student) context.getBean("student1");
        System.out.println(student1);

        ApplicationContext collectionContext = new ClassPathXmlApplicationContext("collectionConfig.xml");
        Teacher teacher1 = (Teacher) collectionContext.getBean("teacher1");
        System.out.println(teacher1);

        ApplicationContext referenceContext = new ClassPathXmlApplicationContext("referenceConfig.xml");
        A aObj = (A) referenceContext.getBean("aRef");
        System.out.println(aObj);
    }
}
