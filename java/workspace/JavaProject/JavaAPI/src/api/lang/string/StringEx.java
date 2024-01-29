package api.lang.string;

import java.util.Arrays;

public class StringEx {

	public static void main(String[] args) {
		
		//문자열 다루기 메서드
		
		String str = "hello world";

		char[] arr = {'h', 'e','l', 'l', 'o'};
		String str2 = new String( arr );
		
		System.out.println(str2);
		
		System.out.println("------------------------------------------");
		
		//1. 문자열의 인덱스 위치를 잘라서 char형 반환
		//char r = str.charAt(0);
		//System.out.println(r);
		System.out.println( str.charAt(0) );
		
		//2. 문자열길이
		System.out.println("문자열길이:" + str.length() );
		
		//3. 문자열 자르기
		System.out.println( str.substring(2)   ); //2인덱스 미만 절삭
		System.out.println( str.substring(2, str.length() ) ); //2이상~11미만 추출
		
		System.out.println("원본문자열:" + str);
		
		//4. 문자열 자르기 split()
		String[] r1 = str.split("");
		System.out.println( Arrays.toString(r1)  );
		
		String[] r2 = str.split("", 5); //최대 길이 5
		System.out.println( Arrays.toString(r2)  );
		
		//5. 문자열 자르기 toCharArray()
		char[] r3 = str.toCharArray();
		System.out.println( Arrays.toString(r3)  );
		
		
		//6. 문자열 치환 replace()
		str = "커피중에 가장 맛있는 커피는 아이스 아메리카노 커피입니다";
		System.out.println(str);
		
		System.out.println( str.replace("커피", "coffee") ); //찾을문자, 바꿀문자
		System.out.println( str);
		System.out.println( str.replaceFirst("커피", "coffee"));
		
		//7. 앞뒤 공백 치환하기 trim()
		str = "    안녕 하세요?    ";
		System.out.println( str  );
		System.out.println( str.trim() );
		
		//8. 문자열 찾기 indexOf
		str = "010-1234-5678";
		
		System.out.println("1이 있는 위치:" + str.indexOf("1") ); //1이 있는 위치
		System.out.println("2번째 인덱스 부터 1이 있는 위치:" + str.indexOf("1", 2)); //2번째 인덱스 부터 1이 있는 위치
		System.out.println("없는 문자열이라면 -1반환:" + str.indexOf("hello") );
		
		//9. 문자열 찾기 contains
		System.out.println( str.contains("1234")  ); //문자가 포함되어 있으면 true
		
		//10. 문자열 찾기 startWith()
		System.out.println( str.startsWith("010") ); //010으로 시작하면 true
		
		
		//11. 문자열 비교 compareTo
		System.out.println( "홍길동".compareTo("홍길자")  ); //음수가 나오면 앞문자가 사전적으로 빠름
		System.out.println( "홍길자".compareTo("홍길동")  ); //양수가 나오면 앞문자가 사전적으로 느림
		System.out.println( "홍길동".compareTo("홍길동")  ); //같은 문자라면 0반환
		
		//12. 문자열 비교 eqauls
		System.out.println( "홍길동".equals("홍길동")  ); //문자자체가 같으면 true
		System.out.println( "abc".equalsIgnoreCase("ABC") ); //대소문자는 무시하고 문자비교
		
		//13. 문자열 합치기 join - 스플릿의 반대
		System.out.println( String.join("^^", "오늘은", "날씨가", "춥습니다")  );
		
		//14. 기본타입을 -> 문자열로변경
		String result = String.valueOf(3);
		System.out.println(result );
		
		
		
		
	}
}
