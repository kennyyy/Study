package day12.static_.method;

public class Count {
	public int a;//일반 변수
	public static int b;//정적변수
	
	//일반메서드 - 일반변수, 정적변수 모두 사용이 됩니다.
	public int method() {
		a = 10;
		b++;
		return b;
	}
	
	//정적 메서드 - static멤버만 사용이 됩니다.
	public static int method2() {
		//a = 10; static만 객체생성없이 사용가능하죠 - 단, 일반변수도 static메서드 안에서 사용하는 방법이 있죠
		//객체를 생성해서는 접근이 됩니다.
		Count c =  new Count();
		c.a = 10;
		b++;
		return b;
	}
}
