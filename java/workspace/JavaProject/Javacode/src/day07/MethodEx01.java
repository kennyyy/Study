package day07;


public class MethodEx01 {

	public static void main(String[] args) {
		// 1.메서드는 클래스 안, (메인메서드도 포함)모든 메서드 밖에 만듭니다.
		//재활용 가능
		System.out.println(calc());
		System.out.println(calc());
		int result = calc(); //새로운변수에 값을 넣을때도 메서드 반환유형에 맞는 유형을 선언해야한다.
		System.out.println(result);
		
		String result2 = randomStr();
		System.out.println(result2);
	}

	//반환유형 이름( ) { 내용 } 
	//일단 static 붙이는 이유는 클래스의 객체 생성없이 사용가능하게 하려고하는 정도만 알아두자 (나중에 다룰 예정 일단 메서드 자체에 집중하자)
	static int calc() {
		//여태 main에서 했던 모든 작업을 여기서 똑같이 다 할 수 있다.
		
		int sum = 0;
		for(int i = 1; i <= 10; i++) {
			sum+=i;
		}
		return sum; //반환유형은 위에서 선언할때 적은 int값을 리턴해야한다.
	}
	
	static String randomStr() {
		String str = "";
		// 0 <= random < 1.0
		double ran = Math.random(); // << .random() 도 사실 매개변수는 없고 반환타입 double을 갖는 메서드이다.
		if(ran > 0.66) {
			str = "야";
			return str; //리턴문을 써서 조건이 맞을때 함수를 탈출 할 수도 있다.
		}else if(ran > 0.33) {
			str = "임마";
		}else {
			str = "너";
		}
		return str; //반환유형은 위에서 선언할때 적은 String값을 리턴해야한다.
	}
	
	static void randomStr2() { //반환유형이 void이면 난 리턴유형을 필요로하지 않아! 라는 뜻
							   //리턴유형을 쓰면 error 발생
		String str = "반환 타입이 void";
		// 0 <= random < 1.0
		
			str = "너";
		
		 
	}
}



