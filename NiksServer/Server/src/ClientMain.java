import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.util.Scanner;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.ArrayList;


public class ClientMain {

	static Socket clientSocket;
	
	
	public static void SendingThread() throws IOException
	{
		Scanner in = new Scanner(System.in);
		// clientSocket = new Socket("localhost", 18080);
		while(true)
		{
			
			String toSend = in.nextLine();
			
			OutputStreamWriter iWriter = new OutputStreamWriter(clientSocket.getOutputStream());
			BufferedWriter sendToServer = new BufferedWriter(iWriter);
			
			sendToServer.write(toSend + "\n");
			sendToServer.flush();
			
		}
	}
	public static void RecievingThread() throws IOException
	{
		while(true)
		{
			IOUtils.readFromIn("From Server: ",clientSocket.getInputStream());
		}
	}
	
	public static void main(String[] args) throws UnknownHostException, IOException {
		// TODO Auto-generated method stub
		
		clientSocket = new Socket("localhost", 18080);
		
		Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
            	try {
            		SendingThread();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
            }
        });
		
		Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
            	try {
					RecievingThread();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
            }
        });
		
		
		thread1.start();
        thread2.start();

	}

}
