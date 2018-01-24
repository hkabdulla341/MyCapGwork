import java.io.DataOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class FiboGenerator extends Thread
{
    DataOutputStream os;

    public FiboGenerator(OutputStream os)
    {
	this.os = new DataOutputStream(os);
    }

    @Override
    public void run()
    {
	System.out.println("Generating Fibo nums..");

	try
	{
	    for (int i = 0; i < 100000; i++)
	    {
		if (isFiboNum(i))
		{
		    try
		    {
			os.writeInt(i);
		    }
		    catch (IOException e)
		    {
			// TODO Auto-generated catch block
			//e.printStackTrace();
		    }
		}
	    }
	}
	catch(Exception e)
	{
	    // do nothing
	}
	finally
	{
	    System.out.println("Completed Fibo nums..");
	    
	    try
	    {
		os.close();
	    }
	    catch (IOException e)
	    {
		// TODO Auto-generated catch block
		e.printStackTrace();
	    }
	}
    }

    private boolean isFiboNum(int num)
    {
	int fib1 = 0;
	int fib2 = 1;
	do
	{
	    int saveFib1 = fib1;
	    fib1 = fib2;
	    fib2 = saveFib1 + fib2;
	}
	while (fib2 < num);

	if (fib2 == num)
	    return true;
	else
	    return false;
    }
}
