package multi_whisper_client;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.regex.Pattern;

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
			
			//2. 아이디를 입력받는 부분 추가
			//out이 가르키는 대상으로 최초 아이디값 전송
			System.out.print("닉네임:");
			while(true) {
				String id = bf.readLine(); //입력받음
				if(id == null || Pattern.compile(":").matcher(id).find() ) { //null이거나 구분자이면 안됨
					System.out.println("사용할 수 없는 아이디 입니다");
					System.out.print("닉네임:");
					continue; //다시 입력받으로 이동
				} else {
					MainClient.userID = id;
					break;
				}
			}
			
			out.println("ID:" + MainClient.userID); //out이 가르키는 대상에 데이터를 전달
			out.flush();
			
			
			while(true) {

				String message = bf.readLine();

				if(message.equals("/exit")) {
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
