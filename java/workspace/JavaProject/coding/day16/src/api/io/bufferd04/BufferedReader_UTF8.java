package api.io.bufferd04;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

public class BufferedReader_UTF8 {

	public static void main(String[] args) {
		
		/*
		 * 문서를 읽어들일 때, 인코딩형식이 다르면 한글이 깨지는 현상이 발생 합니다.
		 * bufferedReader를 통해서 인코딩형식을 지정한후에 가져오는 방법.
		 */
		FileInputStream fis = null;
		InputStreamReader is = null; //인코딩을 지정해서 가져올 수 있는 클래스
		BufferedReader br = null;
		
		
		try {
			//fis = new FileInputStream("D:\\course\\java\\file\\text3.txt");
			//is = new InputStreamReader(fis, "EUC-KR");
			//br = new BufferedReader(is);
			
			br = new BufferedReader( new InputStreamReader( new FileInputStream("D:\\course\\java\\file\\text3.txt"), "EUC-KR") );
			
			
			String str;
			while( (str = br.readLine()) != null) {
				System.out.println(str);
			}
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		
		
		
		
	}
}
