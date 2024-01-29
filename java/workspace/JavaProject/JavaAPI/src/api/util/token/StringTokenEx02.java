package api.util.token;

import java.util.StringTokenizer;

public class StringTokenEx02 {

	public static void main(String[] args) {
		String log = "2023/11/21";
		
		StringTokenizer token = new StringTokenizer(log, "/"); // /기준으로 자름
		
		while(token.hasMoreTokens()) {
			System.out.println(token.nextToken());
		}
		
		System.out.println("-----------------------------------------------");
		String log2 = "2023.11.21, 화요일, 홍길동, 010-1234-5678";
		
		StringTokenizer token2 = new StringTokenizer(log2, ",.- "); //,.-공백 기준으로 자름
		
		while(token2.hasMoreTokens()) {
			System.out.println(token2.nextToken());
		}
		
		System.out.println("-----------------------------------------------");
		
		StringTokenizer token3 = new StringTokenizer(log2, ",", true); // ,도 토큰에 포함시킬지 말지 true false
		while(token3.hasMoreTokens()) {
			System.out.println(token3.nextToken());
		}
	}

}
