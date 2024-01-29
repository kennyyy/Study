package api.io.stream01;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class OutputStreamEx {

	public static void main(String[] args) {
		
		/*
		 * 1. 파일을 쓸 때 사용하는 클래스는 FileOutputStream입니다.
		 * 2. 생성자 매개값으로 파일을 쓸 전체경로를 지정합니다.
		 * 3. io패키지 모든 클래스들은 생성자에 throws키워드가 있기 때문에
		 *    try~catch블록과 함께 써야합니다
		 * 
		 */
		
		Scanner scan = new Scanner(System.in);
		System.out.print("파일명>");
		String name = scan.next();
		
		FileOutputStream fos = null;
		
		try {
			
			fos = new FileOutputStream("D:\\course\\java\\file\\"+ name +".txt");
			
			System.out.print("문장을 입력하세요>");
			scan.nextLine(); // next()다음에 nextLine()을 쓰려고할 때, 그냥 넘어가버리는 문제
			String str = scan.nextLine(); //그 이유가 엔터값기준으로 값을 입력받고, nextLine()에 전달되서 문장의 종료로 인식되기 때문 
			
			byte[] arr = str.getBytes(); //문자열 데이터를 바이트데이터로 변형
			fos.write(arr); //파일을 바이트단위로 써내림
			
			
		} catch (Exception e) {
			
			e.printStackTrace();
		} finally {
			try {
				fos.close();
				scan.close();
			} catch (Exception e2) {
				
			}
			
			
		}
	}
		
	
}
