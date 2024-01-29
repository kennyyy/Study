package completequiz01;

public class MethodQuiz03 {

	public static void main(String[] args) {
		//1. 매개변수 n을 받아서, n까지 약수의 합을 리턴하는 sum() 생성
		//2. 두 수를 매개변수로 받아서, 두 수사이의 합 리턴 sum2() 생성
		// > 두 수의 크기는 정해지지 않음 ex) sum2(1, 10) sum(10, 1) 결과 값은 같음
		//3. java 함수 는 매개변수 로 숫자를 받습니다.
		//   매개변수 숫자길이만큼 패턴 "자바자바자바..."를 리턴 하는 함수를 완성하세요
		//   1이면 자
		//   2이면 자바
		//   3이면 자바자
		//   4이면 자바자바
		
		System.out.println("n까지 약수의 합 : " + sum(6));
		System.out.println("두 수 사이의 합 : " + sum2(10,1));
		System.out.println("두 수 사이의 합 : " + sum2(10,10));
		System.out.println("숫자 길이만큼 리턴 : " + fun(10));
		
	}
	//1.
	static int sum(int n) {
		int sum = 0;
		for(int i = 1; i <= n; i++) {
			if(n % i == 0) {
				sum += i;
			}
		}
		return sum;
	}
	//2.
	static int sum2(int a, int b) {
		int sum = 0;
		int max = a > b ? a : b;
		int min = a > b ? b : a;
		for(int i = min; i <= max; i++) {
			sum += i;
		}
		return sum;
	}
	//3.
	static String fun(int len) {
		String str = "";
		
		for(int i = 1; i <= len; i++) {
			if(i % 2 == 1) {
				str += "자";
			}else {
				str += "바";
			}
		}
		return str;
	}

}
