package main.java.design_patterns.com.milko.training.socket;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.Socket;
import java.net.UnknownHostException;

public class SocketClientDemo {
	public static void main(String[] args) {
		if (args.length < 2) return;
		
		String hostName = args[0];
		int port = Integer.parseInt(args[1]);
		
		try (Socket socket = new Socket(hostName, port)){
			InputStream input = socket.getInputStream();
			BufferedReader reader = new BufferedReader(new InputStreamReader(input));
			String line = reader.readLine();
			System.out.println(line);
		} catch (UnknownHostException ex) {
			 System.out.println("Server not found: " + ex.getMessage());
		} catch (IOException ex) {
			System.out.println("I/O error: " + ex.getMessage());
		}
	}
}
