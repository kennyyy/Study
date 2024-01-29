package single_client;

import java.net.Socket;

public class MainClient {

	public static void main(String[] args) {
		
		try {
			//Client쪽은 전화를 거는 쪽
			Socket clientSocket = new Socket("192.168.104.30", 8383);
			
			//메시지 받는 클래스
			Receive receive = new Receive(clientSocket);
			
			//메시지 전송클래스
			Sender sender = new Sender(clientSocket);
			
			receive.start();
			sender.start();

			
		} catch (Exception e) {
			System.out.println("클라이언트 main에러");
			e.printStackTrace();
		}
		
	}
}
