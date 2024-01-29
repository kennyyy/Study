package api.regex.basic;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexEx01 {

	public static void main(String[] args) {
		
		/*
		 * [0-9] - 숫자0~9 1개
		 * [a-z] - 소문자a~z 1개
		 * [0-9a-zA-Z] - 숫자 알파벳 1개
		 * [가-힣] - 한글 1개
		 * 
		 * ? 0번 또는 1번
		 * * 0번이상 나옴
		 * + 1번이상 나옴
		 * 
		 * [0-9]? = 숫자가 안나오거나 1번 나온다
		 * [0-9]{3} = 숫자가 정확히 3번 나온다
		 * [0-9]{3,4} = 숫자가 3이상 4이하 나온다
		 * [0-9]{3, } = 숫자가 3이상 나온다
		 * 
		 * \\특수문자 - 정규표현식에서 사용하는 특수문자를 문자로 나타내고 싶은경우
		 * \\w - _이거나 영문자
		 * \\W - 반대
		 * 
		 * \\d - 숫자
		 * \\D - 숫자의 반대
		 * 
		 * () 값들의 집합
		 * 
		 * 
		 * 
		 * 
		 */
		
		//여기에서 정확히 전화번호 형식만 찾아봄
		String info = "30세/서울시 강남구/02-123-4567/010-1234-5678/aaa@naver.com";
		
		//String pattern = "[0-9]{2,3}-[0-9]{3,4}-[0-9]{4}";
		String pattern = "\\d{2,3}-\\d{3,4}-\\d{4}";
		
		//정규표현식을 적용
		Pattern p = Pattern.compile(pattern);
		Matcher m = p.matcher(info);
		
		//find(), group(), start(), end()
		while(m.find()) {
			System.out.println("찾은문자:" + m.group() );
			System.out.println("시작위치:" + m.start() );
			System.out.println("끝위치:" + m.end() );
		}

		
		System.out.println("---------------------------------------");
		
		//이메일형식
		//String pattern2 = "[a-zA-Z0-9]+@[a-z]+\\.[a-z]+"; //^$ 시작끝을 나타내는데 생략이 가능함
		String pattern2 = "\\w+@\\w+\\.\\w+"; 
		Matcher m2 = Pattern.compile(pattern2).matcher(info);
		
		
		while(m2.find()) {
			System.out.println(m2.group());
		}
		

		
		
	}
}
