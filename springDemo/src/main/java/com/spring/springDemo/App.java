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
    	

    }
}
