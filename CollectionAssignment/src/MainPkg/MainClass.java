package MainPkg;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class MainClass
{

    public static void main(String[] args)
    {
	String a = "abc";
	String d = "def";
	String g = "ghi";
	String j = "jkl";
	String m = "mno";
	String p = "pqr";
	String s = "stuv";
	String w = "wxyz";
	
	MyComperator comperator = new MyComperator();
	
	Set <String> set = new TreeSet<String>(comperator);
	set.add(a);
	set.add(d);
	set.add(g);
	set.add(j);
	set.add(m);
	set.add(p);
	set.add(s);
	set.add(w);
	
	Iterator<String> itr = set.iterator();
	
	while(itr.hasNext())
	{
	    System.out.print(itr.next());
	}
	
	System.out.println();
	
	for(String str : set)
	{
	    System.out.print(str);
	}
    }

}
