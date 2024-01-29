package day12.static_.singleton;

public class Person {
	
	//디자인패턴 - 클래스 멋지게 설계하는 방법론
	//싱글톤패턴 - 객체를 1개만 생성되도록 설계하는 방법
	
	//1. 나자신의 객체를 멤버변수로 1개 생성합니다.
	private static Person p = new Person();
	
	//2. 객체를 직접 생성하지 못하도록 생성자에 private을 붙입니다.
	private Person() {
		
	}
	
	//3. 객체를 요구할 때, 1번에서 만들어둔 단 1개의 객체를 반환
	public static Person getPerson() {
		return p;
	}
	
	// 변수 1
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}


		
}
