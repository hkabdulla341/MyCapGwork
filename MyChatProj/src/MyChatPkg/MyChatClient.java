package MyChatPkg;

import java.io.*;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;

public class MyChatClient
{

    public static void main(String[] args)
    {
	String hostname = "localhost";
	InetAddress ina = null;
	Socket server_socket = null;
	String message = " ";
	OutputStreamWriter requestStream = null;
	int port = 55555;

	try
	{
	    ina = InetAddress.getByName(hostname);
	    server_socket = new Socket(ina, port);
	    requestStream = new OutputStreamWriter(server_socket.getOutputStream());

	    while (message != "exit")
	    {
		System.out.println("Enter a message : ");

		message = IOUtils.readFromStdIn();
		requestStream.write(message + "\n");
		requestStream.flush();
	    }

	}
	catch (UnknownHostException e)
	{
	    System.out.println("Unable to resolve hostname");
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
		requestStream.close();
	    }
	    catch (IOException e)
	    {
		System.out.println("IO Error : " + e.getMessage());
		System.out.println("\n" + e.getStackTrace());
	    }
	}
    }

}
