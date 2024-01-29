package api.io.buffered;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BufferedEncoding {

	public static void main(String[] args) throws IOException {
		//인코딩 - 인간이 사용하는 문자데이터를 컴퓨터가 아는 문자형태로 표현하는 것
		//한글은 인코딩타입이 맞지 않으면, 전부 깨지는현상이 발생함.
		
		String path = "C:\\Users\\user\\Desktop\\course\\java\\upload\\encoding.txt";
		
		try {
			//인코딩을 지정해서 파일을 읽어 들이는 방법(일시적)
			
			FileInputStream fis = new FileInputStream(path);
			
			InputStreamReader isr = new InputStreamReader(fis, "EUC-KR");
			
			BufferedReader br = new BufferedReader(isr);
			
			String str = "";
			
			while((str = br.readLine())!= null) {
				System.out.println(str);//txt파일은 인코딩이 ANSI타입인데 이클립스는 utf-8형식으로 인코딩한다. (한글 깨짐)
			}
			
			br.close();
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
