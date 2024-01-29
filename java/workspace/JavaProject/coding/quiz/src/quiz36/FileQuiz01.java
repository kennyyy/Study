package quiz36;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class FileQuiz01 {

	public static void main(String[] args) {
		
		/*
		 * 1.스캐너를 통해서 파일명을 정확히 입력받습니다.
		 * 
		 * 2.upload폴더에 해당파일이 있다면, 해당파일을  uploadcopy폴더로 복사하세요
		 *   파일이 없다면 "파일명이 없습니다" 예외구문을 출력합니다.
		 * 
		 * 3.복사도중에 에러가 발생하면 "파일 처리중 예외발생" 구문을 출력.
		 */
		
		Scanner scan = new Scanner(System.in);
		FileInputStream oldFile = null;
		FileOutputStream newFile = null;
		
		try {
			System.out.print("파일명을 입력하세요>");
			String name = scan.next();
			
			
			oldFile = new FileInputStream("D:\\course\\java\\upload\\" + name);
			
			newFile = new FileOutputStream("D:\\course\\java\\uploadcopy\\" + name);
			
			int result;
			byte[] read = new byte[100];
			while( (result = oldFile.read(read)) != -1 ) {
				newFile.write(read, 0, result);
			}
	
			System.out.println("파일 복사 성공");
			
		} catch (FileNotFoundException e) {
			System.out.println("파일을 찾을 수 없습니다");
		} catch (IOException e) {
			System.out.println("파일 처리중 에러가 발생했습니다");
		} finally {
			
			try {
				scan.close();
				oldFile.close();
				newFile.close();
			} catch (Exception e2) {
				
			}
			
		}
		
	}
}
