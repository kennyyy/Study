package day08;

public class ObjectBasic01 {

	public static void main(String[] args) {
		
		System.out.println("1번 계산기 사용");
		System.out.println(add(10));
		System.out.println(add(20));
		System.out.println(add(30));
		
		System.out.println("2번 계산기 사용");
		System.out.println(add2(10));
		System.out.println(add2(20));
		System.out.println(add2(30));
		
		System.out.println("3번 계산기 사용");
		System.out.println(add3(10));
		System.out.println(add3(20));
		System.out.println(add3(30));
		
		
	}//end main
	
	static int result;
	static int add(int a) {
		result += a;
		return result;
	}
	
	static int result2;
	static int add2(int a) {
		result2 += a;
		return result2;
	}
	
	static int result3;
	static int add3(int a) {
		result3 += a;
		return result3;
	}

}

