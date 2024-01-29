package day01;

public class Casting03 {

	public static void main(String[] args) {
		//연산이 일어났을 때 형변환
		System.out.println('A' + 10); //왜 75가 나왔을까?
		
		//1. 서로 다른타입의 연산에서 큰 타입에 맞추어 자동 형변환 됩니다.
		char c = 'b';
		int i = 2;
		
		char cc = (char)(c + i); 
		int ii = c + i; // ->명시적 캐스팅이 없으면 c+1 값이 자동으로 둘중 더 큰 타입인 int값으로 변환된다. 
		System.out.println(cc);
		System.out.println(ii);
		
		//2. int형보다 작은 타입의 연산은 무조건 int가 됩니다.
		byte b1 = 100;
		byte b2 = 3;
		byte b3 = (byte)(b1 + b2); //  int보다 작은타입이므로 자동 int형 상태 -> 명시적 캐스팅으로 타입을 맞춰준다.
		
		System.out.println(b3);
		
		
	}

}
