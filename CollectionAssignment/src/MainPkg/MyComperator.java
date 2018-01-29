package MainPkg;

import java.util.Comparator;

public class MyComperator implements Comparator
{
    @Override
    public int compare(Object o1, Object o2)
    {
	String os1 = (String) o1;
	String os2 = (String) o2;
	
	return os2.compareTo(os1);
    }
}
