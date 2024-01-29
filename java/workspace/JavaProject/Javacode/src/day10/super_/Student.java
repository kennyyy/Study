package day10.super_;

public class Student extends Person{
	
	String studentId; //학번
	
	Student(String name, int age, String studentId){
		//this.name = name;
		//this.age = age;
		super(name, age);//매개변수에 맞는 부모님 생성자를 가져와라 (위 주석하고 같은 표현법)
		this.studentId = studentId;
	}
	
	String info() {
		//return "이름 : " + name + ", 나이 : " + age + ", 학번 : " + studentId;
		
		return super.info() + ", 학번 : " + studentId;//부모의 메서드를 호출 (위 주석하고 같은 표현법)
	}
	void super_() {
		//부모의 멤버변수 참조
		super.age = 10;
		super.name = "홍길동";
	}


}
