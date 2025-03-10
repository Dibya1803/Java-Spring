package com.springcore.spel;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Demo {
	
	@Value("#{22+44}")
	private int x;
	
	@Value("#{33-22+11+44-55}")
	private int y;
	
	@Value("{ new java.lang.String('Dibya') }")
	private String name;
	
	@Value("#{ 8-6>3 }")
	private boolean isActive;
	
	
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	@Override
	public String toString() {
		return "Demo [x=" + x + ", y=" + y + ", name=" + name + ", isActive=" + isActive + "]";
	}
	
	
	
}
