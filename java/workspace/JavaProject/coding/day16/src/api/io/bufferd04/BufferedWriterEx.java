package api.io.bufferd04;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.Scanner;

public class BufferedWriterEx {

	public static void main(String[] args) {
		
		
		Scanner scan = new Scanner(System.in);
		FileWriter fw = null;
		BufferedWriter bw = null;
		
		try {
			/*
			 * 순서대로  nextLine을 써서 2문장을 입력받습니다.
			 * 줄바꿈 처리를 한 다음에 file폴더 안에 text3.txt형식으로 파일을 쓰세요.
			 * 
			 */
			fw = new FileWriter("D:\\course\\java\\file\\text3.txt");
			bw = new BufferedWriter(fw);
			
			System.out.print("한문장>");
			String str1 = scan.nextLine();
			System.out.print("두문장>");
			String str2 = scan.nextLine();
			
			bw.write(str1 + "\r\n" + str2);
			
			System.out.println("파일이 정상 출력되었습니다");
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				bw.close();
				fw.close();
				scan.close();
			} catch (Exception e2) {
				
			}
		}
		
		
	}
}
