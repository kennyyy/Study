package api.collection.set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetEx01 {

	public static void main(String[] args) {
		
		//set객체 생성
		Set<String> set = new HashSet<>();
		
		//값의 추가 add
		set.add("java");
		set.add("java"); //중복 x
		set.add("js");
		set.add("python");
		set.add("spring");
		
		System.out.println(set.size() );
		System.out.println(set.toString() ); //순서 x
		
		//값이 포함되어 있는지 확인
		if(set.contains("java") ) {
			System.out.println("java가 포함됨");
		}
		
		//값을 얻을 때는 반복자(iterator) 개념을 사용해서 반복해야 합니다.
		
		Iterator<String> iter = set.iterator();
		
		/*
		 * while(iter.hasNext()) { System.out.println(iter.next()); }
		 */
		
		
		for(String s : set) {
			System.out.println(s);
		}
		
		//값의 삭제
		set.remove("js");
		System.out.println(set.toString());
		
		
		
	}

}
