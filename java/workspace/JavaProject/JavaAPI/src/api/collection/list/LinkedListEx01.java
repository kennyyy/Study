package api.collection.list;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class LinkedListEx01 {

	public static void main(String[] args) {
		
		//어레이리스트와 사용방법 동일함
		LinkedList<String> list = new LinkedList<>(); //둘다 사용됨 + 링크리스트만의 기능
		//List<String> list = new LinkedList<>(); //리스트기능만 사용됨
		//Queue<String> list = new LinkedList<>(); //큐처럼 사용됨
		
		//값의 추가
		list.add("홍길동");
		list.add("이순신");
		list.add("홍길자");
		
		System.out.println(list.toString());
		
		//링크트리스만의 기능, 앞의추가, 끝의추가
		list.addFirst("A");
		list.addLast("B");
		
		System.out.println(list.toString());
		
		//값 얻기 get(인덱스)
		String x = list.get(0);
		System.out.println(x);
		
		//값 삭제 remove(인덱스), remove(값)
		list.remove(0);
		list.remove("홍길동");
		
		System.out.println(list.toString());
		
		//값의 수정
		list.set(1, "홍길순");
		System.out.println(list.toString());
		
		System.out.println("-------------------------------------");
		
		//queue 기능도 사용됨
		//뒤에 추가
		list.offer("1");
		list.offer("2");
		
		System.out.println(list.toString());
		
		//앞에 삭제
		System.out.println( list.poll() );
		System.out.println( list.toString() );
		
		//값만 확인 peek
		System.out.println( list.peek() );
		
			
		
	}
}
