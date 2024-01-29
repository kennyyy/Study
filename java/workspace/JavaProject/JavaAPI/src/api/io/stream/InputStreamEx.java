package api.io.stream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class InputStreamEx {

	public static void main(String[] args) {
		// 1. 파일을 읽을 때 사용하는 클래스는 FileInputStream 입니다.
		// 2. 1byte기반으로 데이터를 읽어들입니다.
		// 3. InputStream클래스를 상속 받고 있습니다.
		String path = "C:\\Users\\user\\Desktop\\course\\java\\upload\\test.txt";
		
		try {
			FileInputStream fis = new FileInputStream(path);
			int result;
			while( (result = fis.read()) != -1) {//read() - 한글자씩 읽음, 더이상 읽을게 없다면 -1반환
				System.out.println( (char)result);
			}
			
			
			fis.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
