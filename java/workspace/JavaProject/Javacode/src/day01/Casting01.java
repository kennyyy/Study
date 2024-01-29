package day01;

public class Casting01 {

	public static void main(String[] args) {
		//1. 크기가 작은 타입을 큰 타입에 저장할 때는 자동으로 형변환이 일어납니다.
		//JVM이 자동 형 변환 시킵니다.

		byte b = 10;
		
		short s = b; //byte -> short로 자동형변환
		int i = b;
		long l = b;
		
		char c = '가'; //2byte
		int j = c;
		
		System.out.println(j); //44032
		
		int k = 1000;
		float f = k;
		double d = k;
		
		System.out.println(f+ " " + d); //1000.0 1000.0
	}

}
