package day08;

//설계도 쓰는 클래스는 main이 없습니다.
//main을 쓸수도 있지만 일단 초반 단계에서는 클래스마다 main을 쓰면 혼란이 올수 있어 일단 작성하지말고 해보자.
public class Pen {
	
	//클래스의 속성 값을 나타낼때 멤버변수(필드) 라고 부릅니다.
	String ink;
	int price;
	String company;
	
	void write() { //메서드
		System.out.println(ink + "색생 글씨를 씁니다.");
	}
	
	String info() {
		System.out.println("===펜의 정보===");
		System.out.println("색상 : " + ink);
		System.out.println("가격 : " + price);
		System.out.println("제조사 : " + company);
		return company;
	}

}
