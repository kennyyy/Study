package day09.override.basic2;

public class Employee extends Person {
	
	String department;
	
	String info() {
		return "이름 : " + name + ", 나이 : " + age + ", 담당부서 : " + department;
	}
}
