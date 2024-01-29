package api.ramda.basic2;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class MainClass01 {

	public static void main(String[] args) {
		
		
		List<String> list = new ArrayList<>();
		list.add("홍길동");
		list.add("피카츄");
		list.add("라이츄");
		list.add("꼬북이");
		
		for(String s : list) {
			System.out.println(s);
		}
		
		System.out.println("-------------------------------------------");
		
		Stream<String> stream = list.stream();
		
		stream.forEach(a -> System.out.println(a));
		
		System.out.println("-------------------------------------------");
		
		list.stream().forEach(new Consumer<String>() {

			@Override
			public void accept(String a) {
				System.out.println(a);
				
			}
		});
		System.out.println("-------------------------------------------");
		
		list.stream().forEach((String a) -> {
			System.out.println(a);
			
		});
		
		System.out.println("-------------------------------------------");
		
		list.stream().forEach(a -> System.out.println(a));
		
		System.out.println("-------------------------------------------");
	}
}
