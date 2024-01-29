package day08;

public class Variable {
	//멤버변수는 객체로 생성될 때 자동 초기화 들어갑니다. 0, 0.0, false, null
	int a = 1;//초기화 선언가능
		
	void printNum(int c) {
		//지역변수는 반드시 초기화가 들어가야합니다.
		int b = 1;
		
		System.out.println("멤버변수 : " + a);
		System.out.println("지역변수 : " + b);
		//외부로부터 값을 반드시 넣어야 메서드가 실행됨으로, 초기화없이 사용가능
		System.out.println("매개변수 : " + c);
		
	}
	
}
