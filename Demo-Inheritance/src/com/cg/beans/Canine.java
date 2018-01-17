package com.cg.beans;

public class Canine extends Animal{
	public Canine() {
//		super("Canine");		// chaining constructor using super
		System.out.println("instantiating Canine type....");
	}
	
//	@Override
	public void roam(){
		System.out.println("It is roaming in groups...");
		
//		return ;
	}
	
	
}
