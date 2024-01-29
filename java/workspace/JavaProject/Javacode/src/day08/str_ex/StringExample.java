package day08.str_ex;

public class StringExample {

	public static void main(String[] args) {
		//문자열은 참조타입니다.
		String str1 = "홍길동";//같은 메서드안에서는 같은 문자를 참조한다.
		String str2 = "홍길동";
		String str3 = new String("홍길동");
		
		System.out.println(str1);
		System.out.println(str2);
		System.out.println(str3);
		
		//동일한 메서드안에서 동일문자열을 선언하면, 동일한 주소를 가르키게된다.
		//만약 직접 String객체를 생성 하거나, 다른곳에서 넘어온 문자열은 
		//다른 주소를 가르키게 됩니다.
		System.out.println("--------");
		System.out.println(str1 == str2);//실제 주소값 비교 
		System.out.println(str1 == str3);//실제 주소값 비교
		
		//그래서 문자열의 값 자체를 비교할 때는 문자열에서 제공하는 equals()를 사용하면 됩니다.
		
		if(str1.equals(str2)) {
			System.out.println("두 문자가 동일함");
		}
		
		if(str2.equals(str3)) {
			System.out.println("두 문자가 동일함");
		}

	}

}
