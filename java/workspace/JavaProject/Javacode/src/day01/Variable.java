package day01;

public class Variable {

	public static void main(String[] args) {
		//변수의 선언 = 데이터타입 변수명;
		
		int a;
		//초기화 - 변수의 값을 지정하는 과정
		a = 10;
		
		//변수의 선언과 초기화를 동시에
		//int a = 10; 동일한 이름의 변수는 사용 할 수 없음
		int b = 10;
		
		//변수에는 다른 변수를 저장하는게 가능
		int c = a + b;
		
		//문자열을 저장할 때는 String 타입을 사용함
		String str = "홍길동";
		
		//변수의 타입이 다르면, 바로 저장 할 수 없음
		//int d = str;
		
		//변수의 값 변경
		int f = 10;
		f = 20;
		f = 30;
		f = a+b+c;
		System.out.println(f); // 40
	
	}

}
