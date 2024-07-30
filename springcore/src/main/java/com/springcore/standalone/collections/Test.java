package com.springcore.standalone.collections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("com/springcore/standalone/collections/standaloneconfig.xml");
		Person p1=(Person) context.getBean("person1");
		System.out.println(p1);
		System.out.println(p1.getFriends().getClass().getName());
		System.out.println("_________________________________________");
		System.out.println(p1.getFeestructure());
		System.out.println(p1.getFeestructure().getClass().getName());
		System.out.println("*****************************************");
		System.out.println(p1.getProperties());
		System.out.println(p1.getProperties().getClass().getName());
	}

}
