package com.springcore.lifecycle;

public class SamosaUsingXML {
	private double price;

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		System.out.println("Setting price");
		this.price = price;
	}

	public SamosaUsingXML() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Samosa [price=" + price + "]";
	}
	public void hye() {
		System.out.println("Inside init method : Hye, how are you? ");
	}
	
	public 	void bye() {
		System.out.println("Inside destroy method : Bye, TTYL! ");
	}
	
	
	
	
}


