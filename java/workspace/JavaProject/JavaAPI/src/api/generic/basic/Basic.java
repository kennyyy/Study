package api.generic.basic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Basic {

	public static void main(String[] args) {
		//와일드카드 문법
		//여러분이 자바를 사용하다보면 ? 라고 하는 제네릭 문법이 보입니다.
		//List<?> = 리스트면 무엇이든 다 들어갈 수 있음
		//List<? extends String> = ?가 String타입과 String의 자식은 들어갈 수 있음
		//List<? super Integer> = ?가 Integer과 Integer의 부모는 들어갈 수 있음
		
		List<Integer> list = new ArrayList<>();
		
		list.add(1);
		list.add(2);
		list.add(3);
		
		System.out.println(list);
		
		List<Integer> list2 = Arrays.asList(1,2);
		System.out.println(list2);

		System.out.println(list.containsAll(list2)); //1,2가 포함되어있다면 true
		
		
		List<String> li1 = new ArrayList<String>();
		List<Integer> li2 = new ArrayList<Integer>();
		List<Object> li3 = new ArrayList<Object>();
		
		add1(li1);
		add1(li2);
		add1(li3);
		
		add2(li1);
		//add2(li2); //x
		//add2(li3); //x
		
		//add3(li1);
		add3(li2);
		add3(li3);
	}
	public static void add1(List<?> list) {
		
	}
	public static void add2(List<? extends String> list) {
		
	}
	public static void add3(List<? super Integer> list) {
		
	}

}
