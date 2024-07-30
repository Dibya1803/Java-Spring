package com.springcore.javaconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
public class JavaConfig {
	
	@Bean
	public Samosa getsamosa()
	{
		return new Samosa();
	}

	@Bean(name = {"student","temp","con"})
	public Student getStudent() 
	{
		//Creating a New Student object
		Student student= new Student(getsamosa());
		return student;
		
	}
}

