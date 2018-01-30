package comc.g;

import java.io.Serializable;

public class Person implements Serializable {
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return name + "/" + age ;
	}
	
	private String name;
//	private transient int age;
	private int age;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

}
