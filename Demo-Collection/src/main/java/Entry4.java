import java.util.HashSet;
import java.util.Set;

public class Entry4
{

    private static Set<Integer> set = new HashSet<>();

    public static void main(String[] args)
    {

	// Set<Integer> set = new HashSet<Integer>(); // JDK 5
	// JDK 7

	set.add(10);
	set.add(20);
	set.add(30);
	set.add(40);

	Integer iRef1 = new Integer(10);
	Integer iRef2 = new Integer(10);
	System.out.println("iRef1 == iRef2?" + (iRef1 == iRef2));

	iRef1 = Integer.valueOf(10);
	iRef2 = Integer.valueOf(10);
	System.out.println("iRef1 == iRef2?" + (iRef1 == iRef2));

	iRef2 = 20;
	iRef1 = 20;
	System.out.println("iRef1 == iRef2?" + (iRef1 == iRef2));

	for (int value : set)
	{

	    System.out.print(value + "\t");

	}

	System.out.println(search(20));

    }

    public static boolean search(int v)
    {
	Integer iRef = new Integer(v);

	return set.contains(iRef);
    }

}
