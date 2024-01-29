package collection.list;

import java.util.LinkedList;

public class LinkedListEx02 {

	public static void main(String[] args) {
		
		//링크리스트 객체생성
		LinkedList<String> list = new LinkedList<>();
		
		//추가
		list.add("홍길동");
		list.add("홍길자");
		list.add("김길동");
		
		//확인
		System.out.println(list.toString());
		
		//처음에 추가
		list.addFirst("이순신");
		list.addLast("신사임당");
		
		System.out.println(list.toString());
		
		
		//값 얻기
		String name = list.get(0);
		System.out.println("0번째 인덱스의 값:" + name);
		
		//삭제
		list.remove(0);
		System.out.println(list.toString());

		//push, pop, peek - LIFO(last in first out)
		list.push("강감찬"); //앞에서 부터 추가(꺼낼 수 있는 위치로 추가)
		System.out.println(list.toString());
				
		System.out.println(list.pop()); //삭제하면서 읽기
		System.out.println(list.toString());
		
		
		System.out.println(list.peek()); //삭제하지 않고 읽기
		System.out.println(list.toString());;
		
		//offer, poll, peek - FIFO(first in first out)
		list.offer("a"); //마지막에 추가
		list.offer("b");
		list.offer("c");
		System.out.println(list.toString());
		
		System.out.println(list.poll()); //삭제하면서 읽기
		System.out.println(list.toString());
		
		System.out.println(list.peek()); //삭제하지 않고 읽기
		System.out.println(list.toString());

		
	}
}
