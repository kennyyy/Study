package quiz21;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class FileQuiz01 {

	public static void main(String[] args) {
		
		/*
		 * 1. 스캐너를 통해서 읽어들일 파일명을 정확히 입력을 받습니다.
		 * 
		 * 2. upload폴더에 해당파일이 있으면, 이 파일을 copy폴더로 복사하면 됩니다
		 * 
		 * 3. 파일명이 없다면 FileNotFoundException처리
		 * 	  복사도중 에러가 난다면 IOException처리
		 * 
		 */
		String path = "C:\\Users\\user\\Desktop\\course\\java\\upload\\";
		String copyPath = "C:\\Users\\user\\Desktop\\course\\java\\upload\\copy\\";
		Scanner sc = new Scanner(System.in);
		
		String fileName = sc.nextLine();
		
		
		try {
			FileInputStream fis = new FileInputStream(path + fileName);
			FileOutputStream fos = new FileOutputStream(copyPath + fileName);
			byte[] b = new byte[2000];
			int result;
			
			if((result = fis.read(b)) != -1) {
				fos.write(b, 0, result);
			}
			
			
			fis.close();
			fos.close();
	
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
}
