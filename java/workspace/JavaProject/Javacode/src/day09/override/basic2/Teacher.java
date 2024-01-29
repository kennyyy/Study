package day09.override.basic2;

public class Teacher extends Person{
	
	String subject; //과목
	
	String info() {
		return "이름 : " + name + ", 나이 : " + age + ", 담당과목 : " + subject;
	}
}
