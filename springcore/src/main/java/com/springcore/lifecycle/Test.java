package com.springcore.lifecycle;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
	AbstractApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/lifecycle/config.xml");
	//registering shutdown hook                                                                                                                                                                                        
	context.registerShutdownHook();
		
	SamosaUsingXML s=(SamosaUsingXML) context.getBean("s1");
	System.out.println(s);
	
	
	System.out.println("+++++++++++++++++++++++++++++++++++++++");
	PepsiUsingInterface p1=(PepsiUsingInterface) context.getBean("p1");
	System.out.println(p1);
	
	System.out.println("***************************************");
	ExampleUsingAnnotations example=(ExampleUsingAnnotations) context.getBean("example");
	System.out.println(example);
	}

	
}
