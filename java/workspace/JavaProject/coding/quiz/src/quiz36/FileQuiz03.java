package quiz36;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class FileQuiz03 {

	public static void main(String[] args) {
		/*
		 * 1. Date클래스를 이용해서 File경로에 하위폴더로 20200421file 폴더를 생성합니다
		 * 2. 스캐너로 파일명을 입력받고 BufferedWriter를 이용해서 .txt파일을 생성합니다.
		 * 3. 그만을 입력받을 떄 까지 엔터를 포함해서 입력 받습니다.
		 *    \r\n을 적절하게 이용해서 파일 출력을 완료 
		 *    
		 * 4. 파일을 다 썻다면 아무방법으로 읽어들여서 이클립스창에 출력.
		 */
		Scanner scan = new Scanner(System.in);
		
		Date date = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
		String now = sdf.format(date);
		
		
		BufferedWriter bf = null;
		String name = null;
		try {
			
			File file = new File("D:\\course\\java\\file\\" + now + "file"); 
			
			if(!file.exists()) {//폴더생성
				file.mkdir();
				System.out.println("폴더가 생성되었습니다");
			} else {
				System.out.println("폴더가 존재합니다");
			}
			
			
			
			
			System.out.print("파일명을 입력하세요>");
			name = scan.nextLine();
			bf = new BufferedWriter(new FileWriter(file.getPath() + "\\"+ name + ".txt") );
			
			
			System.out.println("[그만]을 입력하면 중지합니다");
			System.out.println("하실말씀>");
			String result = "";
			while(true) {
				
				String str = scan.nextLine();
				
				if(str.equals("그만")) break; //탈출
				
				result += str + "\r\n";
			}
						
			bf.write(result); //글자를 씀

			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				bf.close(); //flush()가 자동으로 실행
			} catch (Exception e2) {
				
			}
		}
		
		///////////////////////파일읽기//////////////////////
		
		BufferedReader br = null;
		
		try {
			//많이 사용되는 인코딩형식 지정후 파일읽기
			br = new BufferedReader( new InputStreamReader( new FileInputStream("D:\\course\\java\\file\\"+ now +"file\\"+ name +".txt" )  , "UTF-8")  );
			
			String str;
			while( (str = br.readLine()) != null) {
				System.out.println(str);
			}

			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				br.close();
			} catch (Exception e2) {
				
			}
		}
		
		
		
		
	}
}
