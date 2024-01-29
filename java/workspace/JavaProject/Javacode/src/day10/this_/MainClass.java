package day10.this_;

public class MainClass {

	public static void main(String[] args) {
		Person  p1 = new Person("홍길동", 20);
		System.out.println("MainClass에서 생성한 p1객체 : " + p1); //호출한 this랑 주소값이 동일하다? this는 결국 자기자신의 주소값이다.
		System.out.println();
		
		Person  p2 = new Person("이순신");
		System.out.println("MainClass에서 생성한 p2객체 : " + p2);
		System.out.println();
		
		Person  p3 = new Person();
		System.out.println("MainClass에서 생성한 p3객체 : " + p3);
		System.out.println();
		
		Student s = new Student("홍길자", 20 ,"1234123");
		
		
	}

}
