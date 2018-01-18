package com.cg.beans;

import com.cg.specs.Pet;

final public class Dog extends Canine implements Pet{

	/*@Override
	public void roam(){
		roamInGroups();
	}*/
	
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
	
	@Override
	public void beFriendly() {
		System.out.println("Dog is friendly");
	}
	
	@Override
	public void play() {
		System.out.println("Dog can play with you");
	}
	
	
	
	
	
	
	
	
	
}
