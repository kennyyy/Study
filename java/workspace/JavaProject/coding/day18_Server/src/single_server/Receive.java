package single_server;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.Socket;

public class Receive extends Thread {
	/*
	 * 메시지 수신 클래스.
	 * 생성자로 소켓 클래스를 반드시 전달 받는다.
	 */
	private Socket socket;
	
	public Receive(Socket socket) {
		this.socket = socket;
	}

	@Override
	public void run() {
		try {
			//전송 받은 데이터는 socket클래스 안에 있는 inputStream에 저장되고
			BufferedReader bf = new BufferedReader(new InputStreamReader(socket.getInputStream(), "UTF-8"));

			while(true) {
				//이 데이터를 readLine()를 통해 가져오고
				String message = bf.readLine();
				
				if(message == null) {
					System.out.println("연결을 종료합니다");
					break;
				} else {
					System.out.println("상대방:" + message);
				}
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
	
	
	
}
