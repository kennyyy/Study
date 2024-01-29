package multi_whisper_client;

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
				
				//3. 메시지를 받아 왔을 때, 자신이라면 콘솔창에 ID부분을 지워주는 부분
				//서버로 부터 넘어온 message를 > 기반으로 자르고 
				//id부분이 본인의 id와 같다면 아이디 부분 출력은 넘겨준다.
				String[] split = message.split(">");
				if(split.length == 2 && split[0].equals(MainClient.userID) ) {
					continue;
				}
				
				//서버로 부터 넘어온 메시지 출력
				System.out.println(message);
			}
			
		} catch (Exception e) {
			System.out.println("클라이언트 receive에러");
			e.printStackTrace();
		}
		
	}
	
	
	
}
