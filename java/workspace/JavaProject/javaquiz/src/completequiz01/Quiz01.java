package completequiz01;

public class Quiz01 {

	public static void main(String[] args) {
		int x = 2;
		int y = 5;
		char c = 'A'; // 'A'의 문자코드는 65

		//단항연산자 값증가
		//char는 산술연산에 샤용되면 int로 변환됨
		System.out.println(1+1.0);
		
		System.out.println(y += 10 - x++); //13
		System.out.println(x+=2); //5
		System.out.println( !('A' <= c && c <='Z') ); //false 
		System.out.println('C'-c); //2
		System.out.println(c+1); //66
		System.out.println(++c); //B
		System.out.println(c++); //B
		System.out.println(c);  //C

		
	}

}
