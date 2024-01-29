package api.io.readwrite;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderEx {

	public static void main(String[] args) {
		
		/*
		 * 1. 2byte기반으로 파일을 읽어들이는 클래스 FileReader
		 * 2. 한글(문자) 형태의 파일데이터를 읽기에 적합합니다.
		 * 3. Reader클래스를 상속받습니다.
		 * 
		 */
		
		String path = "C:\\Users\\user\\Desktop\\course\\java\\upload\\test2.txt";
		
		try {
			FileReader fr = new FileReader(path);
			String str = "";
			int result;
			while((result = fr.read()) != -1) { //한글자를 읽고, 더이상 읽을게 없다면 -1 반환
				str += (char)result;
			}
			System.out.println(str);
			fr.close();
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
