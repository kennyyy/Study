package day11.modi.protec.pac1;

public class B {
	
	public B() {
		//같은 패키지 접근허용
		A a = new A();
		a.bool = true;
		a.method();
	}
}
