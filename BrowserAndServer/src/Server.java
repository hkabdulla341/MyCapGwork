import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class Server
{
    public static void main(String[] args)
    {
	try
	{
	    ServerSocket sevSocket = new ServerSocket(18000);
	    
	    System.out.println("Waiting client connection...");
	    Socket clientSocket = sevSocket.accept();

	    InputStreamReader iReader = new InputStreamReader(clientSocket.getInputStream());
	    BufferedReader buffReader = new BufferedReader(iReader);

	    while (true)
	    {
		String s = buffReader.readLine();
		System.out.println(s);

		if (!buffReader.ready())
		{
		    break;
		}
	    }

	    String toSend = "HTTP/1.1 200 OK\r\n" + "Content-Type: text/html\r\n\r\n" + "\nHello, World!";

	    OutputStreamWriter iWriter = new OutputStreamWriter(clientSocket.getOutputStream());
	    BufferedWriter sendTobrowser = new BufferedWriter(iWriter);

	    sendTobrowser.write(toSend + "\n");
	    sendTobrowser.flush();

	}
	catch (IOException e)
	{
	    System.out.println("exception hit - message : " + e.getMessage());
	}
    }

}
