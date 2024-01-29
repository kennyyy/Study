package api.collection.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapEx01 {

	public static void main(String[] args) {
		
		//<키에대한타입, 값에대한타입>
		//HashMap<Integer, String> map = new HashMap<>();
		Map<Integer, String> map = new HashMap<>();
		
		
		//값을 추가 put
		//키값은 고유해야 합니다.
		map.put(1, "짱구");
		map.put(2, "유리");
		map.put(3, "훈이");
		map.put(4, "철수");
		map.put(5, "짱구");
		map.put(6, "맹구");
		
		System.out.println(map.size());
		System.out.println(map.toString() );
		
		//값의 수정 - 맵에 동일한 키를 이용해서 변경하면 됩니다.
		map.put(5, "홍길동");
		System.out.println(map.toString());
		
		//값을 얻기 get
		String value = map.get(3); //키
		System.out.println("3번 키에대한 값:" + value);
		
		//값을 삭제 remove
		map.remove(5); //키
		System.out.println(map.toString());
		
		//키 or 값의 포함여부
		System.out.println( map.containsKey(3)   ); //키가 있다면 true
		System.out.println( map.containsValue("짱구") ); //값이 있다면 true
		
		//맵을 반복하는 방법
		Set<Integer> set = map.keySet(); //키를 set으로 뽑아서 반환
		for(Integer i : set) {
			System.out.println("키:" + i + ", 값:" + map.get(i) );
		}
		
		System.out.println("-----------------------------------");
		
		Set<Entry<Integer, String>> entry = map.entrySet();
		
		for(Entry<Integer, String> e : entry ) {
			//엔트리는 key, value에 대한 getter를 제공합니다.
			System.out.println("키:" +  e.getKey() + ", 값:" + e.getValue() );
			
		}
		
		System.out.println("-----------------------------");
		
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
