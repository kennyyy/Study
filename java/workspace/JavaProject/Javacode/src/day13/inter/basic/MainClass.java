package day13.inter.basic;

public class MainClass {

	public static void main(String[] args) {
		//인터페이스는 객체 생성을 할 수 없습니다.
		//Inter1 i1 = New Inter1();
		
		Basic b = new Basic();
		b.method01();//오버라이드
		b.method03();
		
		//인터페이스는 부모타입이 될 수 있습니다.
		Inter1 i1 = b;
		i1.method01();
	
		//i1.method03(); (x)
		
		System.out.println("--------------------------");
		
		//인터페이스 타입으로 변환되면, 자시그이 기능을 사용 할 수 없습니다.
		//다시 자식의 기능을 사용하고 싶다면, 형변환이 가능합니다.
		
		Basic bb = (Basic)i1;
		bb.method01();
		bb.method03();
	}

}
