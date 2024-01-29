package day13.final_.field;

public class MainClass {

	public static void main(String[] args) {
		Person p1 = new Person("123123", "홍길동");
		//p1.ssn = "234234";// 변경금지
		
		Person p2 = new Person("345345", "이순신");
		
		//객체마다 다른값을 가질수는 있음
		System.out.println(p1.ssn); //123123
		System.out.println(p2.ssn); //345345
	
		final int a = 1;
		//a = 1; // 변경금지
		
		System.out.println("--------------------");
		System.out.println(Constant.PI);
		System.out.println(Math.PI);
		System.out.println(Constant.O2);
		System.out.println(Constant.EARTH_RADIUS);
		

	}

}
