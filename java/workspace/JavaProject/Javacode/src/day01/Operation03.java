package day01;

public class Operation03 {

	public static void main(String[] args) {
		int x = 10;
		int y = 20;
		
		//2항연산자 (논리 연산자)
		// 앞 뒤 둘다 참일경우 true, 아니면 false
		// & : 조건식 둘다 조건이 맞는지 실행한다.
		//&& : 앞에 조건이 False인 경우 뒤에 조건을 실행하지 않는다.
		if( x != 10 & ++y == 20) { 
			System.out.println("참입니다.");
		}else {
			System.out.println("거짓입니다.");
		}
		
		System.out.println("x는 : " + x + ", y는 : " + y);
		
		x = 10;
		y = 20;
		
		// 앞 뒤 둘중 하나만 참일경우 true, 둘다 거짓일 경우 false 
		// | : 조건식 둘다 조건이 맞는지 실행한다.
		//|| : 앞에 조건이 true인 경우 뒤에 조건을 실행하지 않는다.
		if(x == 10 || ++y == 20) { 
			System.out.println("참입니다.");
		}else {
			System.out.println("거짓입니다.");
		}
		System.out.println("x는 : " + x + ", y는 : " + y);
	}

}
