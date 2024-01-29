package day08;

//퀴즈 멤버변수들의 초기값을 받는 생성자를 만들어보자
public class Person {
	String name;
	int age;
	int tall;
	
	Person(String pName, int pAge, int pTall){
		name = pName;
		age = pAge;
		tall = pTall;
	}
	
	public Person() {
	}

	void info() {
		System.out.println("이름 : " + name);
		System.out.println("나이 : " + age);
		System.out.println("키 : " + tall);
	}
	
	public static void main(String[] args) {
		Person p1 = new Person("홍길동", 20, 180);
		p1.info();
		
		System.out.println("-------------");
		
		Person p2 = new Person();
		p2.name = "김길동";
		p2.age = 40;
		p2.tall = 170;
		p2.info();
		
	}
}
