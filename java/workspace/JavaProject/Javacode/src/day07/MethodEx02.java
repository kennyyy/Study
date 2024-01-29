package day07;

public class MethodEx02 {
	public static void main(String[] args) {
		//매개 변수는 메서드가 실행될 때 필요한 데이터를 외부로부터 받기 위해 사용.
		//메서드의 ()안에 타입과 함께 나열해주면 됩니다.
		
		int result = calc(10); //매개변수에 전달할 값은, 미리 선언한 메서드의 매개변수 타입과 같아야한다.
		System.out.println("1~10까지 합 : " + result);
		
		int result2 = calc2(10,20);//매개변수의 타입, 개수 또한 같아야한다.
		System.out.println("10~20까지 합 : " + result2);
		
		System.out.println(calc3(10, 20, "문자열"));

	}//end main
	
	//메서드 매개변수의 사용
	//반환유형 이름(매개변수) { 내용 } - 매개변수는 언제든 해당 메서드안에서만 활용가능
	static int calc(int n) {
		int sum = 0;
		
		for(int i = 1; i <= n; i++) {
			sum += i;
		}
		return sum;
	}
	
	static int calc2(int a, int b) {
		int sum = 0;
		
		for(int i = a; i <= b; i++) {
			sum += i;
		}
		return sum;
	}
	
	//calc3(int, int, String)
	//a~b까지 문자열 c를 붙여서 반환하는 메서드를 만들어보자.
	static String calc3(int a, int b, String c) {
		String str = "";
		
		for(int i = a; i <= b; i++) {
			str += c + " ";
		}
		return str;
	}

}
