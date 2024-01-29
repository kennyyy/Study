package api.io.buffered;

import java.io.BufferedInputStream;
import java.io.FileInputStream;

public class BufferedInputEx {

	public static void main(String[] args) {
		
		/*
		 * 1. BufferedInputStream은 InputStream의 성능향상 스트림입니다.
		 * 2. 1바이트 단위로 빠르게 읽어들입니다
		 * 
		 */
		
		String path = "C:\\Users\\user\\Desktop\\course\\java\\upload\\abc.txt";
		System.out.print(false);
		try {
			
			//FileInputStream fis = new FileInputStream(path);
			//BufferedInputStream bis = new BufferedInputStream( fis  );
			BufferedInputStream bis = new BufferedInputStream( new FileInputStream(path)  );
			int result;
			while( (result = bis.read() ) != -1 ) {
				
				System.out.println( (char)result );
			}
			
			bis.close(); //내부에 있는 FileInputStream도 자동으로 닫힘
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		
		
	}
}
