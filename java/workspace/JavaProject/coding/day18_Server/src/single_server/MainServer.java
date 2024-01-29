package single_server;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class MainServer {

	public static void main(String[] args) {
		try {
			ServerSocket serverSocket = new ServerSocket(8383);
			//클라이언트의 연결요청을 대기하는 메서드
			//즉, 클라이언트가 해당 포트번호로 연결요청이 들어오면 accept는 대기명령을 해제하고
			//클라이언트와 연결시켜주는 Socket클래스를 생성해서 반환합니다.
			System.out.println("----연결대기중----");
			Socket clientSocket = serverSocket.accept(); 
			
			System.out.println("---welcome to server---");
						
			//socket을 통해 메시지를 받는 클래스
			Receive receive = new Receive(clientSocket);
			
			//socket을 통해 메시지를 전달하는 클래스
			Sender sender = new Sender(clientSocket);
			
			receive.start(); //시작
			sender.start(); //시작
			
			
			
		} catch (Exception e) {
			System.out.println("메인쓰레드 에러");
			e.printStackTrace();
		}
		
		
		
	}
	
}
