import com.cg.util.LinkedList;

public class Entry {
	public static void main(String[] args) {
		
		LinkedList list = new LinkedList();
		
//		STATIC Class' object creation
		LinkedList.NestedClass node2 = new LinkedList.NestedClass();
		
		LinkedList.Node node = list.new Node(10); 
		
		list.add(10);
		list.add(20);
		list.add(30);
		
		list.display();
		
	}
}
