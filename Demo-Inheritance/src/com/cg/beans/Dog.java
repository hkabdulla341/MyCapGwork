package com.cg.beans;

public class Dog extends Canine{

	@Override
	public void roam() {
		roamInGroups();
	}
	
	public void roamInGroups(){
		System.out.println("It is roaming with a group");
		
	}
	
}
