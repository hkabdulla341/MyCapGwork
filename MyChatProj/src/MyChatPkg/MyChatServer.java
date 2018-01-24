package MyChatPkg;

import java.io.InputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class MyChatServer
{
    public static void main(String[] args)
    {
	int port = 55555;
	ServerSocket server_socket = null;
	Socket client_socket = null;
	InputStream in = null;

	try
	{
	    server_socket = new ServerSocket(port);

	    System.out.println("Waiting for client connection ...");

	    client_socket = server_socket.accept();

	    System.out.println("Client connected...");

	    in = client_socket.getInputStream();

	    String message = "";

	    while (message != "exit")
	    {
		message = IOUtils.readFromIn(in);
		IOUtils.displayAString(message);
	    }
	}
	catch (IOException e)
	{
	    System.out.println("IO Error : " + e.getMessage());
	    System.out.println("\n" + e.getStackTrace());
	}
	finally
	{
	    try
	    {
		client_socket.close();
	    }
	    catch (IOException e)
	    {
		System.out.println("IO Error : " + e.getMessage());
		System.out.println("\n" + e.getStackTrace());
	    }
	}
    }

}
