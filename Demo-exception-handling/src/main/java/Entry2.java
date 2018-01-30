import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FilenameFilter;
import java.io.IOException;

public class Entry2 {
	public static void main(String[] args) throws IOException{
		
		String fileName = "test.txt";
		
		FileInputStream fIn = null;

		fIn = new FileInputStream(fileName);
		
		if(fIn == null){
			System.out.println("reference is null");
			return;
		}

//		Starting with JDK 7	(try with resources)
		
		try(FileInputStream fIn2 = new FileInputStream(fileName)){
			int ch = 0;
			do{
				ch = fIn2.read();
				
				ch = 0;
				int ans =  15 / ch;
				
				if(ch == -1)
					break;
			 
				System.out.print((char)ch);
				
			}while(true);
		}
		
		
		
		
/*		
 * prior to JDK 7
 * try{
			int ch = 0;
			do{
				ch = fIn.read();
				
				ch = 0;
				int ans =  15 / ch;
				
				if(ch == -1)
					break;
			 
				System.out.print((char)ch);
				
			}while(true);
		}finally{
	//		Close a resource (file)
			fIn.close();
		}
*/		
		/*FileNotFoundException fne = new FileNotFoundException();
		ArithmeticException aException = new ArithmeticException();
		AssertionError error = new AssertionError();
		
		if(true)
			throw error;
		
		if(true)
			throw aException;
		
		if(true)
			throw fne;*/
	}
}
