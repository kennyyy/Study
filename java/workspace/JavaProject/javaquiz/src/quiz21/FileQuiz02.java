package quiz21;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileQuiz02 {

	public static void main(String[] args) {
		
		/*
		 * 1. 파일명을 입력받습니다.
		 * 2. 사용자가 그만을 입력할 때까지, 작성할 내용을 입력받습니다.
		 * 3. 사용자가 그만을 입력했다면, 마지막에 단 1번으로 파일을 써내립니다.
		 * 
		 */
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("파일명 : ");
		String fileName = sc.nextLine();
		String path = "C:\\Users\\user\\Desktop\\course\\java\\upload\\" + fileName;
		String str = "";
		
		
		try {
			FileWriter fw = new FileWriter(path);
			while(true) {
				System.out.print("내용입력 : ");
				String s = sc.nextLine();
				if(s.equals("그만")) {
					System.out.println("종료");
					fw.write(str);
					break;
				}
				str += s + " ";
			}
			
			fw.close();
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			
			
	
		
		
		
		
	}
}
