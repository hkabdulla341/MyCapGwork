import java.io.IOException;

import comc.g.IOUtils;

public class Entry5 {
	public static void main(String[] args) throws IOException {
		
		System.out.println("Enter a message: ");
		String message = IOUtils.readFromStdIn();
		
//		System.out.println(message);
		
		IOUtils.displayAString(message);
		
	}
}
