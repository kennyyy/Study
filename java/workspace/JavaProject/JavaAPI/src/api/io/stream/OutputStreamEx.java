package api.io.stream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class OutputStreamEx {

	public static void main(String[] args) {
		// 1.파일을 쓸때 사용하는 클래스는 FileOutputStream 클래스 입니다.
		// 2. 1byte기반으로 데이터를 씁니다.
		// 3. OutputStream클래스를 상속받습니다.
		// 4. io패키지에 있는 모든 클래스는 throws를 던지고 있기 때문에, 반드시 try-catch블록과 함께 사용됨
		//OutputStream fos = new FileOutputStream(파일을 쓸 경로);
		
		//String path = "C:\\Users\\user\\Desktop\\course\\java\\upload\\test.txt";
		Scanner sc = new Scanner(System.in);
		FileOutputStream fos = null;
		try {
			
			fos = new FileOutputStream("C:\\Users\\user\\Desktop\\course\\java\\upload\\test.txt");
			System.out.print("문장입력 >");
			String str = sc.nextLine();
			byte[] arr = str.getBytes(); //문자열에 대한 아스키코드를 바이트배열에 담아줍
			fos.write(arr);
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			try {
				fos.close();
			} catch (IOException e) {
				
				e.printStackTrace();
			}
		}
		
	}

}
