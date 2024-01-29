package multi_whisper_client;

import java.net.Socket;

public class MainClient {
	//1. 사용할 아이디를 추가해 준다. ->
	//2. sender에 아이디를 입력받는 부분 추가 -> 
	//3. receive에 자기자신이라면 생략해주는부분추가 
	public static String userID;
	
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
