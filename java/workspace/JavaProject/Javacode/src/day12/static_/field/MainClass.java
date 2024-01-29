package day12.static_.field;

public class MainClass {

	public static void main(String[] args) {
		Count c1 = new Count();
		c1.a++;
		c1.b++;
		
		System.out.println("일반변수 : " + c1.a); //1
		System.out.println("정적변수 : " + c1.b); //1
		
		Count c2 = new Count();
		c2.a++;
		c2.b++;
		
		System.out.println("일반변수 : " + c2.a); //1
		System.out.println("정적변수 : " + c2.b); //2
		
		Count c3 = new Count();
		c3.a++;
		c3.b++;
		
		System.out.println("일반변수 : " + c3.a); //1
		System.out.println("정적변수 c3.b : " + c3.b); //3
		
		//현재 c1.b 는 몇일까요?
		//현재 c2.b 는 몇일까요?
		System.out.println("정적변수 c1.b : " + c1.b); //3
		System.out.println("정적변수 c2.b : " + c2.b); //3
		
		//
		
		//1. static변수는 객체들 사이에서 돌일한 값을 갖게 된다.
		//static이라는 키워드가 붙은 변수나 메서드들은 프로그램 시작 전에 static들을 저장하는 메모리 영역이 따로있고 거기에서 미리생성해놓는다.
		//2. static변수는 객체(Heap 영역)하고는 다른영역에 생성되므로, 객체 생성 없이 접근이 가능하다.
		// 클래스명.변수(메서드)명으로 바로 접근가능
		System.out.println(Count.b);//3
	}

}
