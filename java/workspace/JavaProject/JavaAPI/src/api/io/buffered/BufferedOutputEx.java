package api.io.buffered;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.util.Scanner;

public class BufferedOutputEx {

	public static void main(String[] args) {
		
		/*
		 * 1. Buffered가 붙은 클래스는 기존클래스들의 성능향상 스트림 입니다
		 * 2. BufferedOutputStream 이라고하면, OutputStream의 성능향상 스트림입니다.
		 * 3. 1바이트단위로 빠르게 씁니다.
		 * 
		 */

		String path = "C:\\Users\\user\\Desktop\\course\\java\\upload\\abc.txt";
		
		
		try {
			//FileOutputStream fos = new FileOutputStream(path);
			//BufferedOutputStream bf = new BufferedOutputStream(fos);
			
			BufferedOutputStream bf = new BufferedOutputStream( new FileOutputStream(path) );
			
			String str = "hello world";
			
			bf.write( str.getBytes() );
						
			bf.close(); //close가 일어나면 자동으로 flush가 호출됩니다.
			
			
			System.out.println("파일출력성공");
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		
		
		
		
	}
}
