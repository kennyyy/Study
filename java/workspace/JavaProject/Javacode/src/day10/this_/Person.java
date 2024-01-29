package day10.this_;

public class Person {//부모클래스
	String name;
	int age;
	
	Person(String name, int age) {
		//this.멤버
		this.name = name;
		this.age = age;
		System.out.println("생성자에서 호출한 this : " + this);
		System.out.println(this.info());
	}
	
	Person(String name){
		//System.out.println("나는 " + this + "입니다.");
		//this.name = name;
		//this.age = 10;
		this(name, 10);//this() 나의 생성자 호출
	}
	Person(){
		//System.out.println("나는 " + this + "입니다.");
		//this.name = "이름미정";
		//this.age = 10;
		this("이름미정", 10);//this() 나의 생성자 호출
	}
	String info() {
		return "이름 : " + name + ", 나이 : " + age;
	}
}
