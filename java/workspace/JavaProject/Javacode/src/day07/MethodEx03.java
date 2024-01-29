package day07;

public class MethodEx03 {
	public static void main(String[] args) {
		//[return의 다양한 사용]
		
		//return값이 있는 메서드는 호출문 자체가 값이 됩니다.
		//그럼므로 다른 메서드의 매개값으로 사용 될 수도 있습니다.
		int result = add( add(1,2), add(2,3) );
		System.out.println(result);
		
		System.out.println( add(1,2) ); //<<이것도 사실 println메서드에 add(1,2)의 값을 매개변수로 전달하는것과 같은 것이다!
		
		//반환유형이 없는 메서드는 반환유형 자리에 void라고 적습니다.
		//void형 메서드는 단순히 사용만 가능합니다.
		//return 키워드는 반환과, 종료의 의미를 가집니다.
		//void메서드에서 return;은 단순히 종료의 의미를 가집니다.
		multi();
		//System.out.println(multi()); //x
		//String str = multi(); //x
		
		noReturn("피카츄");
	}
	
	//매개변수 a, b를 받아서 합계를 반환해보자.
	static int add(int a, int b) {
		return a + b;
	}
	
	//반환유형이 없는 메서드
	//반환유형이 void이면 난 리턴유형을 필요로하지 않아! 라는 뜻
	static void multi() {
		System.out.println("5 x 3 = 15");
		return;
	}
	
	//반환유형이 없는 void메서드에서 유일하게 return;은 사용 (o)
	//return; 을 만나면 메서드를 종료시킨다.
	static void noReturn(String name) {
		if(name.equals("피카츄")) {
			System.out.println("피카츄가 진화하면 라이츄입니다.");
			return;//return문 아래에는 코드 작성불가 (return; 을 만나면 즉시 메서드 종료)
		}
		System.out.println(name + "이 아니라 피카츄를 전달하세요.");
	}
}
