package quiz19;

import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;

public class TokenQuiz01 {

	public static void main(String[] args) {
		/*
		 * 1. 스캐너 nextLine() 이용해서 공백을 포함한 문장을 입력을 받습니다.
		 * 2. ,와 공백기준으로 문장을 분리합니다.
		 * 3. 분리된 토큰에 숫자를 붙여서 세로로 출력
		 * 4. 분리된 토큰을 배열에 담아주세요.
		 * 
		 * 안녕, 하세요? 오늘은 ㅋㅋㅋ 
		 * ex) 1. 안녕
		 * ex) 2. 하세요? 
		 * ex) 3. 오늘은
		 * ex) 4. ㅋㅋㅋ
		 * 
		 */
		Scanner sc = new Scanner(System.in);
		
		String str = sc.nextLine();
		
		StringTokenizer st = new StringTokenizer(str, ", ");
		
		String[] strArr = new String[st.countTokens()]; 
		
		int index = 0;
		
		while (st.hasMoreTokens()) {
			String temp = st.nextToken();
			System.out.println(temp);
			strArr[index++] = temp;
			System.out.println( index + ". " + temp);
			
		}
		System.out.println(Arrays.toString(strArr));

	}

}
