package single_server;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class Sender extends Thread {
	/*
	 * 메시지 전송 클래스.
	 * 생성자로 소켓 클래스를 반드시 전달 받는다.
	 */
	
	private Socket socket;
		
	public Sender(Socket socket) {
		this.socket = socket;
	}
	
	@Override
	public void run() {

		try {
			//인풋 스트림을 통해 값을 입력 받는다.
			BufferedReader bf = new BufferedReader(new InputStreamReader(System.in, "UTF-8"));
			
			//프린트아웃풋 스트림을 통해 메시지를 전달한다(생성될때 아웃풋 스트림 전달)
			//- 연결된 소켓 클래스의 아웃풋 스트림을  받는다.
			PrintWriter out = new PrintWriter(socket.getOutputStream()); 

			while(true) {
				
				String message = bf.readLine(); //입력받고
				
				//socket의 아웃풋스트림으로 입력받은 메시지를 전달합니다.
				//즉. 연결되 있는 소켓으로 문자열을 전송합니다.
				out.println(message);
				out.flush();
				
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	
}
