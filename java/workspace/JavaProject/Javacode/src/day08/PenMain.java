package day08;

public class PenMain {

	public static void main(String[] args) {
		
		//펜 기능을 쓰고 싶다면, 객체로 생성해야 합니다.
		//컴퓨터에 new 연산자를 통해 메모리(Heap 영역)에 데이터를 저장할 공간을 할당받으면 인스턴스라고 불리운다 (객체 == Oject == instance)
		Pen redPen = new Pen(); //new는 클래스 타입의 인스턴스(객체)를 생성해주는 역할을 담당한다
		//메모리(Heap 영역)에 데이터를 저장할 공간을 할당받고 그 공간의 참조값(reference value /해시코드)을 객체에게 반환하고 생성자를 호출한다.
		//무슨말인지 모르겠지요? 오늘 포스트를 보면서 이해해 봅시다.
		
		//기능을 사용하고 싶다면 참조연산자 . 을 사용합니다.
		redPen.ink = "빨강";
		redPen.price = 1000;
		redPen.company = "교과서로 배우고 빨간펜으로 다지고";
		
		redPen.write();
		redPen.info();
		
		Pen bluePen = new Pen();
		bluePen.ink = "파랑";
		bluePen.price = 2000;
		bluePen.company = "동아제약";
		
		
		bluePen.write();
		bluePen.info();
		
		//String a = bluePen.info();
		//System.out.println(a);
		
	}

}
