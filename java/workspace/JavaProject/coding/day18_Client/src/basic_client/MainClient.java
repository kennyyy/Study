package basic_client;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.Socket;
import java.net.UnknownHostException;

public class MainClient {

	public static void main(String[] args) {
		
		try {
			Socket clientSocket = new Socket("192.168.104.30", 8383);
		
			//소켓클래스의 inputStream클래스를 이용해서 서버로 부터 데이터를 받아옴
			InputStream is = clientSocket.getInputStream();
			
			BufferedReader bf = new BufferedReader(new InputStreamReader(is, "UTF-8"));
			
			String result = bf.readLine();
			System.out.println(result);//연결후에 result변수에 데이터를 받아옴

						
		} catch (UnknownHostException e) {

			e.printStackTrace();
		} catch (IOException e) {

			e.printStackTrace();
		}
		
	}
}
