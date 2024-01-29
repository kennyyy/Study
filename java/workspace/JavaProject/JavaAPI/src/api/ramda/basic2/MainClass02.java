package api.ramda.basic2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class MainClass02 {

	public static void main(String[] args) {
		// functional interface
		// Consumer - 매개변수가 1개 이상하고, 반환은 void
		// Predicate - 매개변수가 1개 이상이고, 반환이 boolean
		// Function - 매개변수가 1개 이상이고, 반환은 임의의 타입(내가 지정)
		
		
		
		//100개의 랜덤한 값을 가지고 있는 리스트
		List<Integer> list = new ArrayList<>();
		
		for(int i = 0; i < 100; i++) {
			list.add(new Random().nextInt(100) + 1);
		}
		
		
		System.out.println(list.toString());
		//중복제거
		list.stream().distinct().forEach(a -> System.out.print(a + " "));
		
		System.out.println("------------------------------------------");
		//return에 true인 값들만 필터링해서 저장.
		list.stream().filter( a -> a > 50).forEach(a -> System.out.print(a + " "));
		
		//정렬
		list.stream().sorted().forEach(a -> System.out.println(a + " "));
		
		
		//map -> 메서드 안에 정의된 내용을 기준으로 새로운 리스트를 만듬
		//a는 리스트의 요소, 반환은 임의의 새로운값
		list.stream().map(a -> a % 2 == 0 ? "짝" : "홀" ).forEach(a -> System.out.print(a + " "));
	
		System.out.println("------------------------------------------");
		
		list.stream()
		.distinct()
		.map( a -> a > 50 ? a : 0)
		.filter(a -> a != 0)
		.sorted()
		.forEach(a -> System.out.println(a + " "));
		
		
		
		System.out.println("------------------------------------------");
		
		List<Integer> newList = list.stream().map( a -> a < 0 ? -a : a).sorted().collect(Collectors.toList());
		System.out.println(newList);
		
		System.out.println("------------------------------------------");
		
		//각 이름의 최초 0번째 글자만 얻어서, 전부 대문자로 치환
		List<String> list2 = Arrays.asList("Hong", "Lee", "Park", "Choi");
		
		List<String> list3 = list2.stream()
		.sorted()
		.map((a) -> a.substring(0,1).toUpperCase())
		.collect(Collectors.toList());
		
		System.out.println(list3);
		
		
		
		
	}
}
