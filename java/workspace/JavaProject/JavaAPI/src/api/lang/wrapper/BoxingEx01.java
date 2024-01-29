package api.lang.wrapper;

public class BoxingEx01 {

	public static void main(String[] args) {
		int a = 100;
		double b = 3.14;
		char c = 'A';
		boolean d = false;
		
		//boxing = 기본타입을 => 객체형으로 변환
		Integer v1 = new Integer(a);
		Double v2 = new Double(b);
		Character v3 = new Character(c);
		Boolean v4 = new Boolean(d);
		
		//이것은 매우 정석적인 방법
		Object[] arr1 = {v1, v2, v3, v4};
		System.out.println(arr1[0]);
		
		
		
		
		//unboxing = 객체형 => 기본타입으로 변환
		int x = v1.intValue();
		double y = v2.doubleValue();
		char k = v3.charValue();
		boolean j = v4.booleanValue();
		
		
		System.out.println("------------------------------");
		//오토박싱이 생겨서  new Integer 생략가능
		//autoboxing == 자동형변환이다.
		Integer a1 = a;
		int a2 = a1;
		
		//그래서 이것이 가능하다.
		Object[] arr2 = {1, 3.14, 'A', true};
		System.out.println(arr2[0]);

	}

}
