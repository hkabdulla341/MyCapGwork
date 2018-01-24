import java.io.DataOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class PrimeNoGenerator extends Thread
{
    DataOutputStream os;

    public PrimeNoGenerator(OutputStream os)
    {
	this.os = new DataOutputStream(os);
    }

    @Override
    public void run()
    {
	System.out.println("Generate prime no...");

	try
	{
	    for (int i = 2; i < 100000; i++)
	    {
		if (isPrimeNum(i))
		{
//		    System.out.println("Checking prime : " + i);

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
	    System.out.println("Completed prime no...");
	    
	    try
	    {
		os.close();
	    }
	    catch (IOException e)
	    {
		// TODO Auto-generated catch block
//		e.printStackTrace();
	    }
	}
    }

    private boolean isPrimeNum(int num)
    {
	if (num == 2)
	    return true;

	if (num % 2 == 0)
	    return false;

	for (int i = 3; i * i <= num; i += 2)
	{
	    if (num % i == 0)
		return false;
	}
	return true;
    }
}
