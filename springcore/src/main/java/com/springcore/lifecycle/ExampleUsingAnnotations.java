package com.springcore.lifecycle;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class ExampleUsingAnnotations {
	private String subject;

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public ExampleUsingAnnotations() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "ExampleUsingAnnotations [subject=" + subject + "]";
	}
	
	@PostConstruct
	public void start() {
		System.out.println("Starting method");
	}
	
	@PreDestroy
	public void end() {
		System.out.println("Ending method");
	}
	
}
