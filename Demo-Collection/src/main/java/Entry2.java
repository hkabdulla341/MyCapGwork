import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

import com.cg.Person;

public class Entry2 {
	public static void main(String[] args) {
		
		Set set = new TreeSet();
		
		Person person = new Person("Vicky",18);
		set.add(person);
		
		person = new Person("Danny",18);
		set.add(person);
		
		person = new Person("Tom",18);
		set.add(person);

		person = new Person("Alvin",18);
		set.add(person);
		
		System.out.println(set.size());
		
		for(Object p: set)
			System.out.println(p);
		
		System.out.println("Type of iterator for TreeSet"+set.iterator());
	
		TreeSet tree2 = new TreeSet<>(
				
				new Comparator<Person>() {
					public int compare(Person o1, Person o2) {
						return o2.getName().compareTo(o1.getName());
					}
					
				}
				
		);	// end of constructor invokation
		
		tree2.addAll(set);
		
		System.out.println("Using comparator");
		for(Object o: tree2)
			System.out.println(o);
		
		
		
		
	}
	
	
	
	
	
}
