package com.cg.util;

public class Container {

	private String[] messages = new String[1];
	
	public void put(String message) throws InterruptedException{
		Thread.sleep(1100);
		messages[0] = message;
		
		System.out.println("message put in a container");
	}

	public String get() throws InterruptedException{
		Thread.sleep(400);
		System.out.println("message retrieved from in a container");
		return messages[0];
	}
	
	
}
