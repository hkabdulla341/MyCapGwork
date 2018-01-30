package comc.g;

import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class MyService {

	public static void main(String[] args) throws IOException {

		int port = 8080;

		ServerSocket service = new ServerSocket(port);

		System.out.println("Service is started, now");

		Socket clientSocket = service.accept();

		System.out.println("Client is connected, now");

		InputStream in = clientSocket.getInputStream();

		IOUtils.readFromIn(in);

	}

}
