package com.spring.springDemo;

import org.springframework.beans.factory.BeanFactory;
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
    	ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml"); 
    	// when ClassPathXmlApplicationContext is used it will search for the input file in the class path
    	Alien obj1 = (Alien) context.getBean("alien");
    	obj1. code();
    	obj1.age = 15;
    	System.out.println(obj1.age);
    	Alien obj2 = (Alien) context.getBean("alien"); 
    	
//    	Here a new object is created because the scope set in the bean defination is prototype
//    	by Default it is singleton
    	obj2.code();
    	System.out.println(obj2.age);

    }
}
