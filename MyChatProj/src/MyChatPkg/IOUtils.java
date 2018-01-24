package MyChatPkg;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.DataOutputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.Reader;

public class IOUtils
{
    public static void writePrimitives(OutputStream oStream) throws IOException
    {

	// try-finally block

	// Layering streams
	DataOutputStream dOut = new DataOutputStream(oStream);

	try
	{
	    if (dOut != null)
	    {
		dOut.writeDouble(3.14f);
		dOut.writeBoolean(false);
		dOut.writeLong(1L);
		dOut.writeInt(1);
	    }
	}
	finally
	{
	    if (dOut != null)
		dOut.close();
	}

    }

    public static void readPrimitives(InputStream in)
    {

	// try with resources

    }

    public static void readChars() throws IOException
    {

	String fileName = "test.txt";
	FileReader in = new FileReader(fileName);

	do
	{

	    int ch = in.read();

	    if (ch == -1)
		break;

	    System.out.print((char) ch);

	}
	while (true);

    }

    private static InputStreamReader iReader;
    private static BufferedReader buff;
    private static PrintWriter out;

    private static OutputStreamWriter iWriter;
    private static BufferedWriter buffWriter;

    // static initializer

    static
    {
	iReader = new InputStreamReader(System.in);
	buff = new BufferedReader(iReader);
	out = new PrintWriter(System.out, true);

	iWriter = new OutputStreamWriter(System.out);
	buffWriter = new BufferedWriter(iWriter);
    }

    public static String readFromStdIn() throws IOException
    {
	return buff.readLine();
    }

    public static String readFromIn(InputStream in) throws IOException
    {
	InputStreamReader iReader = new InputStreamReader(in);
	BufferedReader buff = new BufferedReader(iReader);

	while (true)
	{
	    String msg = buff.readLine();
	    
	    if (msg != null)
		System.out.println(msg);
	}

    }

    public static void displayAString(String message)
    {
	out.println(message);
	// out.flush();
    }

}
