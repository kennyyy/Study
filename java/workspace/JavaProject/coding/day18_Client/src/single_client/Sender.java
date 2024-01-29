package single_client;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class Sender extends Thread{

	private Socket socket;
	
	public Sender(Socket socket) {
		this.socket = socket;
	}

	@Override
	public void run() {
	
		try {
			BufferedReader bf = new BufferedReader(new InputStreamReader(System.in, "UTF-8"));
			PrintWriter out = new PrintWriter(socket.getOutputStream());
			
			
			while(true) {

				String message = bf.readLine();
				
				if(message.equals("exit")) {
					break; //exit를 입력받으면 클라이언트 종료
				}
				
				
				out.println(message); //out이 가르키는 소켓에 메시지 전달
				out.flush(); //전송
				
			
			}
			
			//연결 해제
			out.close();
			bf.close();
			socket.close();
			
		} catch (Exception e) {
			System.out.println("클라이언트 sender에러");
			e.printStackTrace();
		}
	}
	

	
	
	
}
