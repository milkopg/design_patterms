package main.java.design_patterns.com.milko.training.socket;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.Socket;

public class ReverseServerThread extends Thread{

	private Socket socket;
	
	public ReverseServerThread(Socket socket) {
		this.socket = socket;
	}

	@Override
	public void run() {
		try {
			InputStream inputStream = socket.getInputStream();
			BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream));
			
			OutputStream output = socket.getOutputStream();
			PrintWriter writer = new PrintWriter(output, true);
			
			String text;
			
			do {
				text = reader.readLine();
				String reverseText = new StringBuilder(text).reverse().toString();
				writer.println("Server: " + reverseText);
			} while (!text.equals("exit") ); 
			
			System.out.println("Reverse serverThread exited" + this);
			socket.close();
			reader.close();
		}catch (Exception e) {
			System.out.println("Server exception: " + e.getMessage());
			e.printStackTrace();
		}
		
	}

}
