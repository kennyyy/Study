package multi_whisper_server;

import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.HashMap;

public class MainServer {
	
	//서버에 접속하는 클라이언트의 output을 저장할 리스트
	//public static ArrayList<PrintWriter> list = new ArrayList<>();
	public static HashMap<Integer, ClientVO> map = new HashMap<>();
	//public static ArrayList<ClientVO> list = new ArrayList<>();
	
	public static void main(String[] args) {
		
		/* 
		 * 채팅은 클라이언트와 클라이언트의 대화이다.
		 * 즉, 서버는 클라이언트의 채팅글만 전달하고, 채팅에 참여하지는 않는다.
		 * 그래서 서버는 여러 클라이언트를 서로 연결할 수 있게 하고,
		 * 그것을 각 클라이언트에게 전달하도록 만들어야 합니다.
		 */
		try {
			ServerSocket serverSocket = new ServerSocket(8383); //서버 소켓
			
			while(true) {
				//요청이 들어올 때 까지 대기
				//요청이 들어오면 serverSocket은 클라이언트 socket을 생성해서 반환한다.
				System.out.println("-----연결대기-----");
				Socket socket = serverSocket.accept();
				System.out.println("------연결됨------");
				//요청이 들어오면 클라이언트 관리 클래스를 생성하고, 연결된 소켓의 output을 리스트에 저장한다.
				ClientManager client = new ClientManager(socket); //클라이언트 관리 클래스(생성된 소켓을 전달한다)
				
				
				int port = socket.getPort();
				System.out.println("연결된 포트:" + port);
				
				map.put(port, new ClientVO(null, new PrintWriter(socket.getOutputStream())));
				System.out.println(map.toString());
//				list.add(new ClientVO( new PrintWriter(socket.getOutputStream()))  );
//				System.out.println(list.toString());
				
				//쓰레드 시작
				client.start();
				
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
