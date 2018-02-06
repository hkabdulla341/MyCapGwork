import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Scanner;

import org.omg.CORBA.Environment;

public class ServerMain
{

    static ArrayList<Socket> socketLst;
    static ServerSocket service;
//    static ArrayList<Thread> tList;
    static int port;

    static
    {
	port = 18080;
	socketLst = new ArrayList<Socket>();
//	tList = new ArrayList<Thread>();
    }

    public static void PrintFromClientThread()
    {
	while (true)
	{
	    int count = 0;
	    for (Socket clientSocket : socketLst)
	    {
		// System.out.println(count++);
		try
		{
		    String s = IOUtils.readFromIn("From Client:", clientSocket.getInputStream());
		}
		catch (IOException e)
		{
		    // TODO Auto-generated catch block
		    e.printStackTrace();
		}
	    }
	}
    }

    public static void AcceptingThread() throws IOException
    {
	while (true)
	{
	    Socket clientSocket = service.accept();
	    if (clientSocket != null)
	    {
		System.out.println("Client is connected, now");
		socketLst.add(clientSocket);
		Thread t = new PrintingClass(clientSocket);
//		tList.add(t);
		t.start();
	    }

	    // String s = IOUtils.readFromIn("From
	    // Client:",clientSocket.getInputStream());
	}
    }

    public static void SendingThread() throws IOException
    {
	Scanner in = new Scanner(System.in);
	while (true)
	{
	    String toSend = in.nextLine();

	    for (Socket s : socketLst)
	    {
		OutputStreamWriter iWriter = new OutputStreamWriter(s.getOutputStream());
		BufferedWriter sendToServer = new BufferedWriter(iWriter);

		
		String responseLine = "HTTP/1.1 200 OK";
		responseLine += "Connection : Close";
		responseLine += "Content-Type:text/html";
		
		String html = System.getProperty("line.separator") + "<html><body>Hello World!!</body></html>";
		
		responseLine += html;
		
		sendToServer.write(responseLine + "\n");
		sendToServer.flush();
	    }

	}
    }

    public static void main(String[] args) throws IOException
    {

	service = new ServerSocket(port);

	System.out.println("Service has started, now");

	Thread thread1 = new Thread(new Runnable()
	{
	    @Override
	    public void run()
	    {
		try
		{
		    AcceptingThread();
		}
		catch (IOException e)
		{
		    // TODO Auto-generated catch block
		    e.printStackTrace();
		}
	    }
	});

	Thread thread2 = new Thread(new Runnable()
	{
	    @Override
	    public void run()
	    {
		try
		{
		    SendingThread();
		}
		catch (IOException e)
		{
		    // TODO Auto-generated catch block
		    e.printStackTrace();
		}
	    }
	});

	thread1.start();
	thread2.start();

	// System.out.println("Service has ended");

    }

}
