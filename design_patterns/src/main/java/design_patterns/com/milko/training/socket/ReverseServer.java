package main.java.design_patterns.com.milko.training.socket;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class ReverseServer {

	public static void main(String[] args) {
		if (args.length < 1) return;
		
		int port = Integer.parseInt(args[0]);
		try (ServerSocket serverSocket = new ServerSocket(port)) {
			System.out.println("Server is listenning on port " + port);
			while (true) {
				Socket socket = serverSocket.accept();
				System.out.println("New client id connected " + socket);
				new ReverseServerThread(socket).start();;
			}
			
		} catch (IOException e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
	}

}
