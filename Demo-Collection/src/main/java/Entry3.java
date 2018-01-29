import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

import com.cg.Person;
import com.cg.util.MyComparator;

public class Entry3 {
	public static void main(String[] args) {
		Comparator comparator = new MyComparator();
		Set set = new TreeSet(comparator);
		
		Person person = new Person("Vicky",19);
		set.add(person);
		
		person = new Person("Danny",18);
		set.add(person);
		
		person = new Person("Tom",11);
		set.add(person);

		person = new Person("Alvin",12);
		set.add(person);

		System.out.println(set.size());
		
		for(Object o: set)
			System.out.println(o);
	}
	
	
	
	
	
	
	
	
}
