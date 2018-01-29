package com.cg.util;

import java.util.Comparator;

import com.cg.Person;

public class MyComparator implements Comparator{
	@Override
	public int compare(Object o1, Object o2) {
		int diff;
		
		diff = ((Person)o1).getAge() - ((Person)o2).getAge();
		
		return diff;
//		return 0;

	
	}
	
}
