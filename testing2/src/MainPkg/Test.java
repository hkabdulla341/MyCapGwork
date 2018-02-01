package MainPkg;

public class Test
{
    public static void main(String[] args)
    {
	for (int i = 0; i < 5; i = Increment(i))
	{
	    System.out.print(i);
	}
    }

    private static int Increment(int i)
    {
	int num = (++i) + (i++);
	return num;
    }
}
