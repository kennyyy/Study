package day12.poly.basic;

//자바에서 하나의 클래스 파일에 여러 클래스 선언이 가능합니다.
	//단, 파일명과 동일한 클래스가 존재해야 하고, 해당 클래스만 public이여 합니다.
class A {}
class B extends A {}
class C extends A {}
class D extends B {}
class E extends C {}

public class Basic {
	
	/*
	 * 다형성 - 객체가 다양한 형태를 가지는 성질
	 * -> 자식 객체가 부모타입을 가질 수 있는 성질
	 */
	
	A a = new A(); 
	B b = new B();
	C c = new C();
	D d = new D();
	E e = new E();
	//만약 자식으로 객체선언하면 부모의 모든것들을 물려받기 떄문에, 부모타입에 자식객체를 대입하면 자동형변환이 일어난다.
	A a1 = b; //B -> A타입으로 자동형변환 (자식->부모)
	A a2 = new B();
	A a3 = new C();
	A a4 = new D();
	A a5 = new E();
	
	int x = 1;
	double y = x; //int -> double 자동형변환
	
	//무조건 상속관계여야 다형성이 성립됩니다. 상속관계가 아니라면 다형성 불가.
	
	//Object타입에는 무엇이든 저장된다 (Object클래스는 모든 클래스의 최상위부모이기 때문이다.)
	Object o1 = new A();
	Object o2 = new C();
	Object o3 = "문자열도됨";
	Object o4 = 1;
	Object o5 = 3.14;
	
	
}
