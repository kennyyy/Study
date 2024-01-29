package poly.basic3;

import java.util.Arrays;

public class House {
	
//	private Student[] students;
//	private Teacher[] teachers;
//	private Employee[] employees;
//	
//	private int count1 = 0;
//	private int count2 = 0;
//	private int count3 = 0;
//	
//	public House() {
//		students = new Student[100];
//		teachers = new Teacher[100];
//		employees = new Employee[100];
//	}
//	
//	public void setIn(Student s) {
//		students[count1] = s;
//		count1++;
//	}
	
	/*
	 * 1. 멤버변수로 크기가 100개인 Person배열을 선언
	 * 2. 배열의 순서를 사용할 count변수 선언
	 * 3. setIn() 모든 자식클래스를 받을 수 있도록 선언하세요.
	 *    기능 - Person배열에 순서대로 저장되는 기능
	 *    
	 * 4. 메인클래스에서는 6명의 Person을 전달하세요.
	 */
	
	//멤버변수의 다형성
	private Person[] persons = new Person[300];
	private int count;
	
	//매개변수의 다형성
	public void setIn(Person p) {
		persons[count] = p;
		count++;
		System.out.println(Arrays.toString(persons));
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
