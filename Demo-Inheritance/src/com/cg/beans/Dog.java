package com.cg.beans;

public class Dog extends Canine{

	@Override
	public void roam(){
		roamInGroups();
	}
	
	@Override
	public void eat() {
		System.out.println("Dog is eating");
	}
	
	@Override
	public void sleep() {
		System.out.println("Dog is sleeping");
	}
	
	public void roamInGroups(){
		System.out.println("It is roaming with a group");
		
	}
	
}
