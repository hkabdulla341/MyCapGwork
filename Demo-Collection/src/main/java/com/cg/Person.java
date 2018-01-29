package com.cg;

public class Person  implements Comparable{
	private String name;
	private int age;

	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	public int getAge() {
		return age;
	}

	public String getName() {
		return name;
	}

	public int compareTo(Object o) {
//		return -1;
//		Compare state of objects
		
		int diff = 0;
		
//		diff = this.age - ((Person)o).age;
//		diff = this.name - ((Person)o).name;
		
		diff = this.name.compareTo(((Person)o).name);
		return diff;
	}
	
	@Override
	public String toString() {
		return this.name + "/"+ this.age;
	}
	
	
}
