package api.collection.list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListEx01 {

	public static void main(String[] args) {
		//ArrayList<String> list = new ArrayList<>();
		List<String> list = new ArrayList<>();
		
		//값의 추가
		list.add("JAVA");
		list.add("Spring");
		list.add("Database");
		list.add("Js");
		list.add("Docker");
		
		System.out.println(list.toString());
		
		//크기확인
		System.out.println(list.size());
		
		//값을 중간에 추가
		list.add(2,"이순신");
		System.out.println(list.toString());
		
		//값을 한번에 추가
		String[] arr = {"A", "B", "C"};
		List<String> newList = Arrays.asList(arr);
		list.addAll(newList);
		
		System.out.println(list.toString());
		
		//값의 확인 get
		//list[0] == list.get(0)
		String x = list.get(0);
		System.out.println(x);
		System.out.println(list.toString()); //리스트 길이는 변함 x
		
		//값의 삭제 remove(인덱스), remove(값)
		list.remove(2);
		System.out.println(list.toString());
		
		list.remove("A");//가장 첫번째로 발견되는 A를 삭제
		System.out.println(list.toString());
		
		//값의 수정 set
		list.set(3, "홍");
		System.out.println(list.toString());
		
		//포함여부 확인
		if(list.contains("JAVA")) {
			System.out.println("JAVA가 존재함");
		}
		
		//전체삭제 clear
		list.clear();
		System.out.println(list.toString());
		
		
		
		
				
				
	}

}
