package api.lang.object;

public class MainClass {

	public static void main(String[] args) {
		/*
		 * Object클래스 (최상위 부모)
		 * - equals() : 동일객체인지 확인
		 * - hashcode() : 객체의 숫자값
		 * - toString() : 객체자체를 문자열의 형태로 반환 (오버라이딩 해서 많이 사용)
		 * - clone() : 객체 복사
		 * - getClass() : 현재 실행되는 클래스를 반환
		 * - finallize() : 객체가 소멸되기 전에 실행
		 */
		Person park = new Person("복제인간");
		//clone메서드
		try {
			Person clonePerson = (Person)park.clone();
			
			System.out.println("복사된 객체의 멤버변수:" + clonePerson.getName());
			
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		
		
		
		
		Person p = new Person("홍길동");
		String name = p.getName();
		
		System.out.println( p.toString() );
		Person p2 = new Person("홍길자");
		System.out.println(  p.equals(p2) );

		//finalize는 gc가 호출되는 순서를 보장하지 않기 때문에 권장되지 않습니다.
		p = null;
		p2 = null;
		System.gc();
		
		
		

		
		
		
		
	}
}
