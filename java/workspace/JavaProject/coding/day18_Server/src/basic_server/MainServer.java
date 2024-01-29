package basic_server;

import java.io.IOException;
import java.io.OutputStream;
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
			
			//Socket클래스에 있는 출력스트림을 얻어옵니다.
			OutputStream os = clientSocket.getOutputStream();
			//메세지를 바이트형태로 바꿔 client에 전달합니다.
			String massage = "써버에서 보낸 메시지";
			os.write( massage.getBytes() );
			
			serverSocket.close();
			clientSocket.close();
			
			System.out.println("----연결해제----");
			
		} catch (IOException e) {
		
			e.printStackTrace();
		} 
		
	}
}
