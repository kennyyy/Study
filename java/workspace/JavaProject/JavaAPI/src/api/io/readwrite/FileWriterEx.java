package api.io.readwrite;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterEx {

	public static void main(String[] args) {
		// 1. 문자(한글)를 써서 저장할 때 사용하는 클래스는 FileWriter클래스 입니다.
		// 2. 2byte단위로 문자를 씁니다.
		// 3. Writer클래스를 상속받습니다.
		// 4. 비디오 or 오디오 같은 파일을 쓰기에는 적합하지 않습니다.
		
		String path = "C:\\Users\\user\\Desktop\\course\\java\\upload\\test2.txt";
		
		try {
			
			//FileWriter fw = new FileWriter(path);
			FileWriter fw = new FileWriter(path, true); //기존파일에 내용을 추가함
			String str = "아 쉬는시간이네?\r집에가고싶다";
			
			fw.write(str);
			
			fw.close();
			
			System.out.println("파일생성완료");
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
