import java.util.Iterator;
import java.util.LinkedList;
import java.util.TreeSet;

public class Entry
{
    public static void main(String[] args)
    {
	LinkedList<String> list = new LinkedList<String>();

	list.add("XYZP");
	list.add("ABNC");
	list.add("PQR");

	Iterator<String> itr = list.iterator();

	System.out.println("Iterating on a Linked List");
	while (itr.hasNext())
	{
	    Object ob = itr.next();
	    System.out.print(ob + "\t");
	}

	TreeSet<String> tree = new TreeSet<String>(list);

	Iterator<String> itr2 = tree.iterator();

	System.out.println("\nIterating on a Tree Set");
	while (itr2.hasNext())
	{
	    Object ob = itr2.next();
	    System.out.print(ob + "\t");
	}
	System.out.println();
	
	System.out.println("Using for each");
	
	for(String str : tree)
	{
	    System.out.print(str + "\t");
	}
    }
}
