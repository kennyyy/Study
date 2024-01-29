package day12.static_.singleton;

public class MainClass {

	public static void main(String[] args) {
		
		Person p = Person.getPerson();
		Person p2 = Person.getPerson();
		
		System.out.println(p);
		System.out.println(p2);
		
		p.setName("홍길동");
		
		System.out.println(p.getName());
		System.out.println(p2.getName());
		
	}
}
