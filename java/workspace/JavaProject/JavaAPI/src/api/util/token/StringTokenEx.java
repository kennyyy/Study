package api.util.token;

import java.util.StringTokenizer;

public class StringTokenEx {

	public static void main(String[] args) {
		//StringTokenizer클래스 (split보다 더 다양한 문자열 자르기 제공)
		
		String str1 = "오늘 날씨는 맑고, 매우 추워요";
		
		StringTokenizer st = new StringTokenizer(str1);
		
		System.out.println("잘린 문자개수 : " + st.countTokens());
		
		//사용법 - 반복자개념을 사용합니다.
		//System.out.println(st.nextToken());
		//System.out.println(st.nextToken());
		//System.out.println(st.nextToken());
		//System.out.println(st.nextToken());
		//System.out.println(st.nextToken());
		//st.hasMoreElements(); 이안에 내부적으로 hasMoreTokens이 있으니 그냥 hasMoreTokens을 쓰는게 좋다
//		//st.nextElement() 또한 마찬가지
		while(st.hasMoreTokens()) {
			System.out.println(st.nextToken());
		}
		

		

	}

}
