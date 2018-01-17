package com.cg.beans;

// Eclipse uses incremental compiler

public class Animal extends Object{
	private String type;
	
	public Animal() {
		System.out.println("instantiating Animal type....");
	}
	
	/*public Animal(String type) {
		this.type = type;
	}*/
	
	
	public void eat(){
		System.out.println("It is eating...");
	}

	public void sleep(){
		System.out.println("It is sleeping...");
	}

	public void roam(){
		System.out.println("It is roaming...");
	}

	
}