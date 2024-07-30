package com.springcore.stereotype;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("com/springcore/stereotype/stereoconfig.xml");
		Student student=context.getBean("ob",Student.class);
		Student student1=context.getBean("ob",Student.class);
		System.out.println(student);
		System.out.println(student.getAddress());
		System.out.println(student.getAddress().getClass().getName());
		
		System.out.println("__________________________________________________________________");
		
		System.out.println(student.hashCode());
		System.out.println(student1.hashCode());
	
	}
	

}
