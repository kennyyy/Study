package day01;

public class Operation05 {

	public static void main(String[] args) {
		//랜덤한 값을 만드는 기능 Math.random()
		//0이상~1미만 랜덤한 값 반환값 : double
		
		double r = Math.random() * 10; // 0이상~10미만
		int i = (int) (Math.random()*10) + 1;// 1이상~11미만 = 1~10의 랜덤한 정수값 
		System.out.println(i); 
		//3항 연산식
		System.out.println(i % 3 == 0 ? "3의배수입니다" : "3의배수가 아닙니다");
		
		//3항 연산 변수에 저장
		// 변수 = 조건식 ? 참일경우 실행 : 거짓일 경우 실행
		String s = i % 3 == 0 ? "3의배수입니다" : "3의배수가 아닙니다";
		System.out.println(s);
		System.out.println("-----------------");
		
		//Math.random() 이용해서 -5~5 까지 랜덤한 정수를 생성
		//반드시 절대값만 나올 수 있도록 3항연산식을 작성해보세요.
		
		int a = (int) (Math.random() * 11) - 5; //-5이상 ~ 6미만
		System.out.println("랜덤 값 : " + a);
		int b = a > 0 ? a : -a;
		System.out.println("절대 값 : " + b);
		
	
	}

}
