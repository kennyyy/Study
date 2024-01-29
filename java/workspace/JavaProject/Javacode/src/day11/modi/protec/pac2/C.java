package day11.modi.protec.pac2;

import day11.modi.protec.pac1.*;

public class C extends A{
	public C() {
		//default와 접근범위 동일
		//A a = new A();
		
		//protected는 상속관계에서 super키워드로 접근이 가능합니다.
		super();
		super.bool = true;
		super.method();
	}
}
