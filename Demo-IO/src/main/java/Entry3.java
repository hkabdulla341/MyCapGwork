import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import comc.g.IOUtils;

public class Entry3 {
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		String fileName = "test.ser";
		FileOutputStream fOut = new FileOutputStream(fileName);
		IOUtils.writeAPersonIntoStream(fOut);
		

		FileInputStream fIn = new FileInputStream(fileName);
		IOUtils.readAPerson(fIn);
		
		System.out.println("end of main()...");
	}
}
