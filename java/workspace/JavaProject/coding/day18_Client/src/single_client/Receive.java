package single_client;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class Receive extends Thread {

	private Socket socket;
	
	public Receive(Socket socket) {
		this.socket = socket;
	}

	
	@Override
	public void run() {

		try {
			BufferedReader bf = new BufferedReader(new InputStreamReader(socket.getInputStream(), "UTF-8"));

			while(true) {
				String message = bf.readLine();
				
				System.out.println("서버로부터전달:" + message);
			}
			
		} catch (Exception e) {
			System.out.println("클라이언트 receive에러");
			e.printStackTrace();
		}
		
	}
	
	
	
}
