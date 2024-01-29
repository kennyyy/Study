package day08;

public class ObjectBasic02 {

	public static void main(String[] args) {
		System.out.println("1번 계산기 사용");
		
		Calculator cal = new Calculator();
		
		System.out.println(cal.add(10));
		System.out.println(cal.add(20));
		System.out.println(cal.add(30));
		
		System.out.println("2번 계산기 사용");
		
		Calculator cal2 = new Calculator();
		
		System.out.println(cal2.add(10));
		System.out.println(cal2.add(20));
		System.out.println(cal2.add(30));
		
		System.out.println("3번 계산기 사용");
		
		Calculator cal3 = new Calculator();
		
		System.out.println(cal3.add(10));
		System.out.println(cal3.add(20));
		System.out.println(cal3.add(30));
	}

}
