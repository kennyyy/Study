package day08.overload.basic;

public class Basic {
	//오버로딩 - 이름이 같은 메서드를 여려개 만드는 것
	//규칙
	//1. 이름이 똑같음
	//2. 반환유형은 오버로딩에 영향을 미치지 않는다.
	//3. 매개변수 타입 or 종류 or 순서를 다르게 해야합니다.
	
	void input(int a) {
		System.out.println("정수 1개 입력받음");
	}
//	int input(int a) { 반환유형은 오버로딩에 영향을 미치지 않음.
//		return 0;
//	}
	
	void input(int a, int b) {
		System.out.println("정수 2개 입력받음");
	}
	void input(String a, double b) {
		System.out.println("문자열 1개, 실수 1개 입력받음");
	}
	void input(double b, String a) {
		System.out.println("실수 1개, 문자열 1개  입력받음");
	}
	void input(char a, int b, String c) {
		System.out.println("문자 1개, 정수 1개, 문자열 1개");
	}
}

