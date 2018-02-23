import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Solution
{
    private static final Scanner scan = new Scanner(System.in);

    public static void main(String args[]) throws Exception
    {
	// read the string filename
	String filename = "name_text_00.txt";

	String[] splitFname = filename.split("_");

	ArrayList<String> cFileNames = new ArrayList<String>();
	ArrayList<String> cppFileNames = new ArrayList<String>();
	ArrayList<String> csFileNames = new ArrayList<String>();

	BufferedReader buffR = null;
	FileReader fileR = null;

	try
	{

	    fileR = new FileReader(filename);
	    buffR = new BufferedReader(fileR);

	    String oneFileName;

	    while ((oneFileName = buffR.readLine()) != null)
	    {
		System.out.println(oneFileName);

		String[] splitFileName = oneFileName.split("\\.");

		/*
		 * String ext =
		 * oneFileName.substring(oneFileName.lastIndexOf(".")); .c/.cpp/.cs
		 */

		if (splitFileName[1].equals("c"))
		{
		    cFileNames.add(oneFileName);
		}
		else if (splitFileName[1].equals("cpp"))
		{
		    cppFileNames.add(oneFileName);
		}
		else if (splitFileName[1].equals("cs"))
		{
		    csFileNames.add(oneFileName);
		}
	    }
	}
	catch (Exception ex)
	{
	    System.out.println("Exception - " + filename + " - " + ex.getMessage());
	}

	String listOfCFile = "";
	String listOfCPPFile = "";
	String listOfCSFile = "";

	for (String str : cFileNames)
	{
	    listOfCFile += str + System.getProperty("line.separator");
	}

	for (String str : cppFileNames)
	{
	    listOfCPPFile += str + System.getProperty("line.separator");
	}

	for (String str : csFileNames)
	{
	    listOfCSFile += str + System.getProperty("line.separator");
	}

	listOfCFile = listOfCFile.trim();
	listOfCPPFile = listOfCPPFile.trim();
	listOfCSFile = listOfCSFile.trim();

	File cfile = new File("c_names_list_" + splitFname[2]);
	File cppfile = new File("cpp_names_list_" + splitFname[2]);
	File csfile = new File("cs_names_list_" + splitFname[2]);

	PrintWriter writer = new PrintWriter(cfile);
	writer.println(listOfCFile);
	writer.close();

	writer = new PrintWriter(cppfile);
	writer.println(listOfCPPFile);
	writer.close();

	writer = new PrintWriter(csfile);
	writer.println(listOfCSFile);
	writer.close();
    }
}
