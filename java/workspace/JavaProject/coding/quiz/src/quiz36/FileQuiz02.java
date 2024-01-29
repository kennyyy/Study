package quiz36;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.text.SimpleDateFormat;
import java.util.Date;

public class FileQuiz02 {

	public static void main(String[] args) {
		
		/*
		 * 1. Date클래스를 이용해서 file경로에 20200421.txt이름으로 파일을 씁니다
		 * 2. 내용은 아무거나 작성하세요.
		 * 3. 파일을 정상적으로 썻다면 BufferedReader를 통해서 파일을 읽어들이세요.
		 *    
		 * 
		 */
		Date date = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
		String now = sdf.format(date);
		
		FileWriter fw = null;
		BufferedWriter bw = null;
		
		try {
			
			
			fw = new FileWriter("D:\\course\\java\\file\\" + now + ".txt");
			bw = new BufferedWriter(fw);
			
			bw.write("안녕하세요. 오늘은 날씨가 맑습니다"); //글자를 씀
						
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				bw.close();
				fw.close();
			} catch (Exception e2) {

			}
			
		}
		
		//////////////////파일읽기////////////////
		
		FileReader fr = null;
		BufferedReader br = null;
		
		try {
			
			fr = new FileReader("D:\\course\\java\\file\\" + now + ".txt");
			br = new BufferedReader(fr);
			
			String str;
			while( (str = br.readLine() ) != null ) {
				System.out.println(str);
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				br.close();
				fr.close();
			} catch (Exception e2) {
				
			}
		}
		
		
		
		
		
		
		
	}
}
