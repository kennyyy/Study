package day07;

import java.util.Arrays;

public class StringMethod {
	public static void main(String[] args) {
		//문자열 다루기 메서드
		
		//문자열 "ABC";
		String str = "ABC";
		char [] arr = {'A', 'B', 'C'};
		
		String str2 = new String(arr);
		
		System.out.println(str);
		System.out.println(str2);
		
		//문자열 다루기 메서드 - 문자열.메서드명()
		
		//문자열은 인덱스가 존재함 시작은 0
		
		//문자열 다루기 메서드 = 문자열.메서드명()
		//1. 문자열 길이 length()
		str = "안녕하세요~?";
		int result = str.length();
		System.out.println("문자열 길이: " + result);
		
		//2. 인덱스 번호 위치를 잘라서 char형으로 반환 charAt()
		char a = str.charAt(0);
		System.out.println(a);
		
		//3. 문자열 자르기 substring()
		String b = str.substring(3); //해당 인덱스 미만 짤라버림
		System.out.println(b);
		
		String c = str.substring(3,5);//매개변수 3이상 ~ 5미만 추출  
		System.out.println(c);
		
		//4.문자열 자르기 split()

		str = "010-1324-5678";
		
		String[] d = str.split("-"); //구분자 기준 배열을 나눠줌
		System.out.println(Arrays.toString(d));
		
		//5. 문자열 자르기 toCharArray()
		char[] e = str.toCharArray(); //한글자씩 잘라서 char배열에 넣어줌
		System.out.println(Arrays.toString(e));
		
		//6.문자열 찾기 indexof()
		System.out.println(str);
		
		int f = str.indexOf("2");
		System.out.println("2를 찾은 위치 : " + f);
		
		int g = str.indexOf("헐"); //없는값이면 -1 반환
		System.out.println("없는 값이라면 : " + g); 
		//if(str.indexOf("헐") != -1){ } //헐 문자열이 있음.
		
		int h = str.lastIndexOf("0"); //뒤에서부터 처음 발견된 index반환
		System.out.println("0을 뒤에서 부터 찾은 위치 : " + h);
		
		//7. 문자열 찾기 contains(), startWith()
		boolean i = str.contains("010"); 
		System.out.println("010의 포함여부 : " + i);
		
		boolean j = str.startsWith("1324");
		System.out.println("str값이 1324로 문자열이 시작하는지 여부 : " + j);
		
		//8. 문자열 치환 replace()
		str = " 중에 가장 맛있는 는 아이스아메리카노";
		String k = str.replace("커피", "coffee");
		System.out.println(k);
		
		String l = str.replaceFirst("커피", "코피");
		System.out.println(l);
		
		//9. 특정 조건 문자열 대체하기 replace() 
		//모든 공백 없애기
		String m = str.replace("우", "");
		System.out.println(m+"");
		
		//10. 양측 공백 삭제 trim()
		str = "  안녕하세요? 오늘은 화요일 입니다   ";
		String n = str.trim();
		System.out.println(n);
		
		//11. 대소문자 변경 toUpperCase(), toLowerCase()
		str = "aBcDeFg";
		String o = str.toUpperCase();
		System.out.println(o);
		
		String p = str.toLowerCase();
		System.out.println(p);
		
		//12. 문자열의 나열순서 비교. compareTo
		//각 자리의 글자 아스키코드(유니코드)로 비교해서, 문자열 대소 비교
		System.out.println("홍길동".compareTo("홍길동"));//같으면 0 반환
		System.out.println("홍길동".compareTo("홍길자"));//음수가 나오면 앞 문자가 대상보다 사전적으로 앞에있음
		System.out.println("홍길자".compareTo("홍길동"));//양수가 나오면 앞 문자가 대상보다 사전적으로 뒤에있음
		
		//13. 문자열을 구분자로 연결, join() - 스플릿의 반대
		//특정 구분자를 값 사이에 연결함
		String q = String.join("-", "hello", "world", "join", "만세");
		System.out.println(q);
		
	}
}
