import java.io.IOException;
import java.net.Socket;
import java.util.Random;

public class PrintingClass extends Thread{
	
	private Socket s;
	
	public PrintingClass(Socket s) {
		this.s = s;
	}
	
	@Override
	public void run() {

		try {
			IOUtils.readFromIn("From Client:",s.getInputStream());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}