package api.io.buffered;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.Writer;

public class 빠른입출력 {

	public static void main(String[] args) {
		//Scanner는 편의를 위해서 만들어진 클래스.
		//System.out.println도 편의 위해서 만들어진 메서드.
		
		//빠른입력
		
		try {
			
			//빠른입력
			//Reader r = new InputStreamReader(System.in);
			//BufferedReader br = new BufferedReader(  r );
			
			BufferedReader br = new BufferedReader( new InputStreamReader(System.in));
			System.out.println(br.readLine()); 
			
			
			//빠른출력
		
			
			Writer w = new OutputStreamWriter( System.out ); //콘솔로의 출력
			BufferedWriter bw = new BufferedWriter( w );
			
			bw.write("내가하고싶은말...."); 
			bw.flush();
			
			
			
			System.out.println(br.readLine());
			
			bw.close();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
