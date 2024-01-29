package day10.super_;

public class Person {//부모클래스
	String name;
	int age;
	
	Person(String name, int age) {
		super();//안써놓으면 자동적으로 써짐
		this.name = name;
		this.age = age;
		System.out.println("생성자에서 호출한 this : " + this);
		System.out.println(this.info());
	}
	
	Person(String name){
		
		this(name, 10);
	}
	Person(){
		this("이름미정", 10);
	}
	String info() {
		return "이름 : " + name + ", 나이 : " + age;
	}
}
