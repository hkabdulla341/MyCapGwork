import java.util.Iterator;
import java.util.LinkedList;
import java.util.TreeSet;

public class Entry {
	
	public static void main(String[] args) {
		LinkedList list = new LinkedList();
		
		list.add("XYZP");
		list.add("ABNC");
		list.add("PQR");
		
		
		
		Iterator itr = list.iterator();
		
		System.out.println("Iterating on a Linked List");
		while(itr.hasNext()){
			Object ob = itr.next();
			System.out.print(ob + "\t");
		}
		
		TreeSet tree = new TreeSet(list);
		
		Iterator itr2 = tree.iterator();
		
		System.out.println("\nIterating on a Tree Set");
		while(itr2.hasNext()){
			Object ob = itr2.next();
			System.out.print(ob + "\t");
		}
		
		
		
		
		
		
		
		
	}
	
	
	
	
}
