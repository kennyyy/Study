package completequiz01;

public class MethodQuiz01 {

	public static void main(String[] args) {
		System.out.print("[method1] : ");
		method1();
		
		System.out.println("[method2] : " + method2("안녕"));
		System.out.println("[method3] : " + method3(1, 3, 5.5));
		System.out.println("[method4] : " + method4(2424332));
		
		System.out.print("[method5] : ");
		method5("안녕", 5);
		
		System.out.println("[maxNum] : " + maxNum(32, 14));
		System.out.println("[abs] : " + abs(-5));

	}
	//"안녕" 기능출력
	static void method1() {
		System.out.println("안녕");
	}
	//전달받은 매개 변수 리턴
	static String method2(String s) {
		return s;
	}
	//세 매개변수 합 리턴
	static double method3(int a, int b, double c) {
		return a + b + c;
	}
	//매개변수가 짝수면 "짝수", 홀수면 "홀수" 리턴
	static String method4(int n) {
		if(n % 2 == 0) {
			return "짝수";
		}else {
			return "홀수";
		}
	}
	//매개변수 int만큼 String 반복 출력
	static void method5(String s, int n) {
		String str = "";
		for(int i = 0; i < n; i++) {
			str += s;
		}
		System.out.println(str);
	}
	//매개변수 2개를 입력받아 큰 수 리턴
	static int maxNum(int a, int b) {
		return a > b ? a : b ;
	}
	//절대값 리턴
	static int abs(int a) {
		return a > 0 ? a : -a ;
	}
	
}
