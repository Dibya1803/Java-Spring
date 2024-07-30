package com.springcore.constructorinjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("com/springcore/constructorinjection/ciconfig.xml");
		Person p = (Person) context.getBean("person");	
		System.out.println(p);
	
		Addition ad=(Addition) context.getBean("add");
		ad.doSum();
		
		Addition add=(Addition) context.getBean("addd");
		add.doSum();
		
		Addition addd=(Addition) context.getBean("adddd");
		addd.doSum();
	}
	
	
	

}
