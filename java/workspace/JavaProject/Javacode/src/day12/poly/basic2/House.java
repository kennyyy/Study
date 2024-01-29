package day12.poly.basic2;

import java.util.Arrays;

public class House {
	//멤버변수 - Person을 저장할 수 있는 배열
	private Person[] arr = new Person[10];
	private int i = 0;
	
	//Persion객체를 받아서 멤버변수에 저장한다.
	public void addPerson(Person p) {
		arr[i] = p;
		i++;
		System.out.println(Arrays.toString(arr));
	}
	
	
	
	//Persion객체의 정보를 출력합니다.
	public void printPerson(Person p) {
		System.out.println(p.info());
	}
	//Person배열 객체를 받아서 정보를 출력합니다.
	public void printPerson(Person[] person) {
		for(Person p : person) {
			System.out.println(p.info());
		}
	}
}
	
	
