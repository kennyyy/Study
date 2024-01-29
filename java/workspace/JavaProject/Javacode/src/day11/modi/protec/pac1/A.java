package day11.modi.protec.pac1;

public class A {
	//protected는 기본적으로 같은 패키지에서만 사용 할 수 있습니다.
	//default랑 접근 범위는 동일합니다.
	//단, 패키지가 다르더라도 상속관계에서 super를 통한 접근은 허용됨.
	
	protected boolean bool;
	
	
	protected A() {
		
	}
	
	protected void method() {
		
	}
}
