import java.util.ArrayList;
import java.util.Optional;
import java.util.Random;

public class MainClass03 {

	public static void main(String[] args) {

		ArrayList<Integer> list = new ArrayList<>();
		for(int i = 0; i < 10; i++) {
			list.add( new Random().nextInt(100) + 1 );
		}
		System.out.println(list.toString());

		//함수적 인터페이스 Comparator사용하기
//		Optional<Integer> o = list.stream().max(new Comparator<Integer>() {
//			@Override
//			public int compare(Integer x, Integer y) {
//				System.out.println(x +"-" + y);
//				//Integer클래스의 비교 메서드
//				return x.compareTo(y); //(x < y) ? -1 : ((x == y) ? 0 : 1)
//			}
//		});
//		System.out.println(o.get());
		
		Optional<Integer> o = list.stream().max( (x, y) -> x.compareTo(y) );
		System.out.println("최대:" + o.get());
		
		Optional<Integer> o2 = list.stream().min( (x, y) -> x.compareTo(y) );
		System.out.println("최소:" + o2.get());
		
		
		//인트스트림
//		IntStream.range(1, 11).forEach( (a) -> System.out.println(a) );
//	
//		System.out.println("요소합:" + IntStream.range(1, 11).sum());; //미만
//		
//		System.out.println("개수:" + IntStream.range(1, 11).count());;
//		
//		System.out.println("요소 평균:" + IntStream.range(1, 11).average().getAsDouble());
//				
//		System.out.println("가장큰값:" + IntStream.range(50, 101).max().getAsInt() );
//		
//		System.out.println("가장작은값:" + IntStream.range(50, 101).min().getAsInt() );
//			
//		IntStream.range(1, 11).filter( (a) -> a % 2 == 0 ); //a가 짝수일 경우에만 반환
		
		
	}
	
}
