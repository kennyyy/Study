package day01;

public class Operation01 {

	public static void main(String[] args) {
		//-------------단항연산자-------------
		
		//부호연산자 +, -
		int i = -3;
		int j = -i;
		
		System.out.println(j);
		
		//증감연산자 ++, --
		int k = 1;
		int h = k++; //후위연산 -> 먼저 값을 대입, 그 다음에 자신 1증가
		
		System.out.println("k값 : "+ k );
		System.out.println("h값 : "+ h );
		
		int x = 1;
		int y = ++x; //전위연산 -> 먼저 값을 증가, 그 다음에 대입
		
		System.out.println("x값 : "+ x );
		System.out.println("y값 : "+ y );
		
		//일반적인 사용
		x = 1;
		
		System.out.println(x++);
		System.out.println(++x);
		
		//비트연산자 ~ (많이 사용x)
		byte b = 10; //0000 1010
		System.out.println(~b); // 1111 0101
		
		//논리 반전연산 ! (영어로 not)
		System.out.println(!true); //false
		boolean bool = !false; //true

	}

}
