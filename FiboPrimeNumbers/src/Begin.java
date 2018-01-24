import java.io.DataInputStream;
import java.io.EOFException;
import java.io.IOException;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;

public class Begin
{

    public static void main(String[] args)
    {
	try
	{
	    PipedOutputStream pOut1 = new PipedOutputStream();
	    PipedInputStream pIn1 = new PipedInputStream(pOut1);

	    PipedOutputStream pOut2 = new PipedOutputStream();
	    PipedInputStream pIn2 = new PipedInputStream(pOut2);

	    Thread fiboNumThread = new FiboGenerator(pOut1);
	    fiboNumThread.start();

	    Thread primeNoThread = new PrimeNoGenerator(pOut2);
	    primeNoThread.start();

	    DataInputStream dIn1 = new DataInputStream(pIn1);
	    DataInputStream dIn2 = new DataInputStream(pIn2);

	    int fiboNum = dIn1.readInt();
	    int primeNum = dIn2.readInt();
	    boolean flag = false;

	    try
	    {
		while (!flag)
		{
		    try
		    {
			if (fiboNum == primeNum)
			{
			    System.out.println(fiboNum);

			    fiboNum = dIn1.readInt();
			    primeNum = dIn2.readInt();
			}
			else if (fiboNum < primeNum)
			{
			    fiboNum = dIn1.readInt();
			}
			else if (primeNum < fiboNum)
			{
			    primeNum = dIn2.readInt();
			}
		    }
		    catch (EOFException e)
		    {
			flag = true;
		    }
		}
	    }
	    catch (IOException e)
	    {
		// TODO Auto-generated catch block
//		e.printStackTrace();
	    }
	}
	catch (Exception e)
	{
//	    e.printStackTrace();
	}

    }

}
