package ramda.stream;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.Set;
import java.util.function.BiConsumer;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MainClass02 {

	public static void main(String[] args) {
		/*
		 * 람다의 구현매개변수 사용문법 
		 * Predicate - 매개변수를 받고, boolean형으로 반환
		 * Function - 매개변수를 받고 임의의 값으로 반환한다.
		 * Consumer - 매개변수를 받고 반환은 하지 않는 형태
		 * Supplier - 매개변수는 없고 반환 형태는 지정할 수 있다. (Consumer와 반대)
		 * 
		 */
		List<Integer> list = new ArrayList<>();
		
		for(int i = 0; i < 100; i++) {
			list.add( new Random().nextInt(100) + 1 );
		}
		
		System.out.println(list.toString());
		
		
		System.out.println("---------------------------------------------------");
		//forEach는 Consumer
		//중복제거 distinct()
		list.stream().distinct().forEach( (num) -> System.out.print(num + " ") );
		
		System.out.println("\n---------------------------------------------------");
		
		//filter는 Predicate
		//걸러내는 기능 filter()
		Stream<Integer> s1 = list.stream().filter( (num) -> {
			return num % 2 == 0; //true일 경우에만 반환
		});
		
		s1.forEach( (num) -> System.out.print( num + " ") );
		
		System.out.println("\n---------------------------------------------------");
		
		
		//정렬 sorted()
		list.stream().sorted().forEach( (num) -> System.out.print(num + " "));
		
		
		System.out.println("\n---------------------------------------------------");
		
		//map은 function
		//map() 은 메서드의 안에 정의된 새로운  stream으로 반환
		Stream<String> s2 = list.stream().map( (num) -> {
			return num % 2 == 0 ? "짝수" : "홀수";
		});
		s2.forEach( (str) -> System.out.print(str + " " ) );
		
		//50보다 크면 값을 반환, 아니면 0반환 (Function, Consumer)
		list.stream().map( (t) -> t > 50 ? t : 0).forEach( t -> System.out.print(t + " ")); 
		
		System.out.println("\n--------------------------------------------------");
		//50보다 크면 값을 반환, 아니면 0 반환 0 제거. (Function, Predicate, Consumer)
		list.stream().map( (t) -> t > 50 ? t : 0).filter( (a)-> a != 0).forEach( t -> System.out.print(t + " "));

		System.out.println("\n--------------------------------------------------");
		
		List<Integer> result = list.stream().filter( (num) -> {
			return num % 3 == 0;
		}).collect( Collectors.toList() );
		
		System.out.println(result.toString());
		
		
		
		
		System.out.println("\n---------------------------------------------------");
		//최종처리 - max() 큰값, min, avg, max

		long r1 = list.stream().mapToInt((t) -> t).count();
		int r2 = list.stream().mapToInt((t) -> t).sum();
		double r3 =list.stream().mapToInt((t) -> t).average().getAsDouble();
		int r4 = list.stream().mapToInt((t) -> t).max().getAsInt();
		
		System.out.println(r1);
		System.out.println(r2);
		System.out.println(r3);
		System.out.println(r4);
System.out.println("\n----------------------------");
		
		//list의 중복을 제거하고, 짝수만 찾아낸다음, 정렬하고, 짝홀수로 변경한 결과를 List로 반환받고 forEach구문으로 처리
		
		list.stream().distinct().filter( (num) -> {
			return num % 2 == 0;
		}).sorted().map( (num) -> {  
			return num % 2 == 0 ? "짝수" : "홀수";			
		}).collect( Collectors.toList()).forEach( (s) -> System.out.print(s + " ") );
		
		
		
		
		
		
	}
}
