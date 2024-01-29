package day01;

public class DataType {

	public static void main(String[] args) {
		
		byte a = -127;//-128 ~ 127
		short b = 32767;
		int c = 2147483647;
		
		long a5 = 2312132131231313122L;
		
		
		//2진수 - 0b 앞에
		//8진수 - 0 앞에
		//16진수 - 0x앞에
		
		int a6 = 0110;
		System.out.println(a6);
		
		float b1 = 3.141592F; //기본값이 double이기때문에 float는 F를 붙입니다 - 정밀도 7자리까지
		double b2 = 3.14159211122; //정밀도 15자리까지
		
		System.out.println(b1);
		
		//e표기법
		double b3 =  0.000314e4; //4자리 올라감
		double b4 = 314.15e-2; //2자리 내려감
		
		System.out.println(b3);
		System.out.println(b4);
		
		//boolean = 참 거짓
		boolean c1 = true;
		boolean c2 = false;
		
		System.out.println(c1);
		System.out.println(c2);
		
		//문자 타입
		//char = 'a' //한글자
		//String = "문자열"
		
		char d1 = 'A';
		char d2 = 'A' + 32;
		
		System.out.println(d1);
		System.out.println(d2);
		
		//Java에서는 char 는 아스키코드 1byte가아닌 유니코드인 2byte로 쓰이고, 65536개 글자에 숫자값을 지정
		char d3 = 44032;
		char d4 = '가';
		char d5 = '\uAC00';
		
		System.out.println(d3 + "-" + d4 + "-" + d5);
		//문자열 
		String s1 = "hello";
		String s2 = "world!!";
		
		
		//문자열의 연산
		//문자열 + 로 붙이면 문자열을 붙인 결과를 가져옵니다.
		System.out.println(s1 + s2);
		
		//문자열과 서로 다른타입의 + 연산 = 결과는 무조건 문자열이 된다.
		System.out.println(200 + 200); //400
		System.out.println(200 + "200"); //200200
		System.out.println(200 + 200 + "200"); // 400200
		System.out.println("200" + 200 + 200); // 200200200
		
		//문자형하고 문자형은 전혀 다른타입
		System.out.println("A" + 10); //A10
		System.out.println('A' + 10); //75
		
		
	}

}
