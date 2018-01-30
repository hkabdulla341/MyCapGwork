package comc.g;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.io.Reader;

public class IOUtils {
	public static void writePrimitives(OutputStream oStream) throws IOException{
		
//		try-finally block
		
//		Layering streams
		DataOutputStream dOut = new DataOutputStream(oStream);
		
		try{
			if(dOut != null){
				dOut.writeDouble(3.14f);
				dOut.writeBoolean(false);
				dOut.writeLong(1L);
				dOut.writeInt(1);
			}
		}finally{
			if(dOut != null)
				dOut.close();
		}
		
	}
	
	public static void readPrimitives(InputStream in){
		
//		try with resources		
		
		
	}

	public static void readChars() throws IOException{
		
		String fileName = "test.txt";
		FileReader in = new FileReader(fileName);
		
		do{
			
			int ch = in.read();
			
			if(ch == -1)
				break;
			
			System.out.print((char)ch);
			
		}while(true);
		
		
	}
	
	static public void writeAPersonIntoStream(OutputStream oStream) throws IOException{
		
		ObjectOutputStream out = new ObjectOutputStream(oStream);
		
		Person person = new Person();
		person.setAge(28);
		person.setName("Vicky");
		
		try {
			if(out != null)
				out.writeObject(person);
			
//			person = new Person();
//			person.setAge(35);
			person.setName(new String("Vikas"));
			out.writeObject(person);
		} finally {
			// TODO: handle finally clause
			if(out != null)
				out.close();
		}
		
		
		
		
	}

	
	public static void readAPerson(InputStream iStream) throws IOException, ClassNotFoundException{
		
		Person pRef;
		
		ObjectInputStream in = new ObjectInputStream(iStream);
		
		pRef = (Person) in.readObject();
		System.out.println(pRef);

		Person pRef2 = (Person) in.readObject();
		System.out.println(pRef2);
		
		
		
	}
	
	private static InputStreamReader iReader; 
	private static BufferedReader buff; 
	private static PrintWriter out;
	
//	static initializer
	
	static{
		iReader = new InputStreamReader(System.in);
		buff = new BufferedReader(iReader);
		out = new PrintWriter(System.out,true);
	}
	
	public static String readFromStdIn() throws IOException{
		return buff.readLine();
	}
	
	public static String readFromIn(InputStream in) throws IOException{
		InputStreamReader iReader = new InputStreamReader(in);
		BufferedReader buff = new BufferedReader(iReader);
		
		while(true){
			System.out.println(buff.readLine());
		}
		
	}
	
	public static void displayAString(String message){
		out.println(message);
//		out.flush();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
