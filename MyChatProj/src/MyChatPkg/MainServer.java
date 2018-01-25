package MyChatPkg;

import java.io.IOException;
import java.net.*;

public class MainServer
{
    private static final int DEFAULT_PORT = 55555;    
    
    public void run()
    {
	int port = DEFAULT_PORT;

        ServerSocket reception_socket = null;
        try
        {
            reception_socket = new ServerSocket(port);
            System.out.println("Started SERVER on port : " + port + "\n");
        }
        catch (IOException io)
        {
            System.out.println("Cannot create server socket");
            System.exit(0);
        }

        for(;;)
        {
            Socket client_socket = null;

            try
            {
                client_socket = reception_socket.accept();
                System.out.println("Accepting request from "
                        + client_socket.getInetAddress());

            }	
            catch (IOException ex)
            {
                System.out.println("Problem accepting client socket");
            }
            
           // MyChatServer client = new MyChatServer(client_socket);
           // client.start();
        }
    }
    
    public static void main(String[] args)
    {
	new MainServer().run();
    }
}
