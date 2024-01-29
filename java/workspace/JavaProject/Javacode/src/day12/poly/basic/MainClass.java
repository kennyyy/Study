package day12.poly.basic;
/*
 * 다형성(Polymorphism)

- 다형성이란 "객체가 여러 형태를 가진다"라는 의미로 해석되며(객체의 형태변환), 하나의 객체가 여러가지 유형으로
사용되는 것을 의미합니다.

int x = 1;
double y = x;
처럼

ex) Parent par = new Child();

무조건 앞에 선언된 타입을 따라간다.
즉 자식 메모리로 선언하되, 객체의 타입은 부모로한다.
부모의 기능밖에 못씀, 단, 부모에 있는 것중 overriding된 메서드는 사용가능(부모꺼니깐)하며 먼저 실행된다.
 */
public class MainClass {

	public static void main(String[] args) {
		Child child = new Child();
		child.method01();
		child.method02();
		child.method03();
		
		System.out.println("------다형성 적용------");
		
		//업캐스팅
		//부모님이 가진 메서드만 사용가능함
		//단, 오버라이드 된 메서드는 먼저 실행됩니다.
		Parent p = child;//Parent p = new Child();
		p.method01();
		p.method02();//오버라이드 된 메서드 실행
		//p.method03(); 객체 타입이 부모이기때문에 자식꺼는 못씀
		
		System.out.println(p);
		System.out.println(child);
		System.out.println(p == child);//같음 -> 일시적으로 부모타입으로 변환
		
		System.out.println("------클래스 형변환------");
		//다형성으로 객체 형변환이 일어나면, 자식 타입의 메서드를 사용할 수 없는 문제가 발생.
		//클래스 캐스팅() - 다시 원래 타입으로 변환이 가능하빈다.
		
		Child cc =(Child)p; //p는 다형성이 적용 되었던 변수(다운캐스팅)
		cc.method01();
		cc.method02();
		cc.method03();
		
		//다형성이 일어나지 않은 객체를 대상으로 형변환을 하면 에러가 발생합니다.
		Child c = (Child)new Parent();//이건 말도안됨,자식클래스는 부모클래스를 상속받아서 부모의 정보가 있지만,
										//부모클래스는 자식클래스에 대한 정보를 모른다.
		//java.lang.ClassCastException 발생
	
		//Child c1 = new Parent(); (X)
	
				
		//////////////////////////////////////////
		//다형성이 일어나지 않은 객체를 대상으로 형변환을 하면 에러가 발생합니다.
		Object o = new Object(); //o는 String의 s도 없는친구
		System.out.println(o);
		String s = (String)o;
				
			
	}

}
