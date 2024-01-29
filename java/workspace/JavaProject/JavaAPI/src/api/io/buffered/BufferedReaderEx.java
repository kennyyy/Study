package api.io.buffered;

import java.io.BufferedReader;
import java.io.FileReader;

public class BufferedReaderEx {

	public static void main(String[] args) {
		
		/*
		 * 1. BufferedReader는 Reader클래스의 성능향상 보조 스트림입니다.
		 * 2. 2byte단위로 읽어들입니다.
		 */
		
		
		String path = "C:\\Users\\user\\Desktop\\course\\java\\upload\\def.txt";
		
		try {
			BufferedReader br = new BufferedReader(new FileReader(path));
			
			//String str = br.readLine();
			//System.out.println(str);
			String str;
			while((str = br.readLine()) != null) {
				System.out.println(str);
			}
			br.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		
		
		
		
		
		
		
	}
}
