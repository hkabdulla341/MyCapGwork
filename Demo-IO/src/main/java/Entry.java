import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

import comc.g.IOUtils;

public class Entry {
	public static void main(String[] args) {
		
		String fileName = "test.prmt";
		
		try {
			OutputStream out = new FileOutputStream(fileName);
			IOUtils.writePrimitives(out);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
		
		
		
		
		
		System.out.println("end of main()...");
	}
}
