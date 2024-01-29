package day12.poly.basic2;

public class Teacher extends Person{
	
	String subject; //과목
	
	Teacher(String name, int age, String subject){
		this.name = name;
		this.age = age;
		this.subject = subject;
	}
	
	String info() {
		return "이름 : " + name + ", 나이 : " + age + ", 담당과목 : " + subject;
	}
	
}
