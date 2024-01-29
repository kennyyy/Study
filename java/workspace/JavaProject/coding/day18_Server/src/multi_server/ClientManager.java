package multi_server;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class ClientManager extends Thread{

	private Socket socket;
	private String id;	
		
	public ClientManager(Socket socket) {
		this.socket = socket;
	}
	
	@Override
	public void run() {
		
		try {
			//소켓 클래스로 부터 전달된 입력스트림을 받는다.
			BufferedReader bf = new BufferedReader(new InputStreamReader(socket.getInputStream(), "UTF-8"));
			
			while(true) {
				String message = bf.readLine(); //소켓으로 부터 넘어온 입력스트림을 message에 저장한다.
				
				//socket이 끊어졌다는 의미
				if(message == null) { 
					System.out.println(id + "님이 퇴장했습니다"); //서버에 출력한다.
					
					//1.연결된 모든 소켓에 전달한다. (main클래스의 static으로 변경)
					for(int i = 0; i < MainServer.list.size(); i++) {
						PrintWriter pw = MainServer.list.get(i);
						pw.println(id + "님이 퇴장했습니다");
						pw.flush(); //flush로 송신 
					}
					//2. 현재 클라이언트와 연결된 스레드를 종료한다.
					break; 
				} //end if
				
				String[] split = message.split(":");
				if(split.length == 2 && split[0].equals("ID")) {
					this.id = split[1]; //아이디 멤버변수에 스플릿값(아이디부분)을 저장
					System.out.println(this.id + "님이 입장하였습니다"); //서버에 출력
					
					//1.연결된 모든 소켓에 전달한다.
					for(int i = 0; i < MainServer.list.size(); i++) {
						PrintWriter pw = MainServer.list.get(i);
						pw.println(id + "님이 입장하였습니다");
						pw.flush(); //flush로 송신 
					}
					continue; //처음으로 돌아간다.(하지않으면 두번출력됨)
				}
				
				//일반 메시지를 모든 소켓에 전달한다.
				for(int i = 0; i < MainServer.list.size(); i++) {
					PrintWriter pw = MainServer.list.get(i);
					pw.println(this.id + ">" + message);
					pw.flush();
				}
				
				
				//이것만 열어두면 서버의 올라오는 메시지만 확인이 가능하다.
				//System.out.println(this.id + ">" + message);
				
				
			} //end while (소켓이 끊어질 때 까지 반복된다)
			
			//종료되는 시점에서 list에 해당 소켓의 outputStream을 제거하고 소켓을 닫는다.
			MainServer.list.remove(new PrintWriter(socket.getOutputStream() ) );
			
			
		} catch (Exception e) {
			//e.printStackTrace();
			System.out.println(this.id + "님 연결이 끊겼습니다");
		}
		
	}

	
}
