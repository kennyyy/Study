package day09.override.basic2;

public class MainClass {

	public static void main(String[] args) {
		Person p = new Person();
		p.name = "홍길동";
		p.age = 20;
		System.out.println(p.info());
		
		Student s = new Student();
		s.name = "김길동";
		s.age = 30;
		s.studentId = "123456";
		System.out.println(s.info());
		
		Teacher t = new Teacher();
		t.name = "피카츄";
		t.age = 40;
		t.subject = "언제언제까지나";
		System.out.println(t.info());
		
		Employee ep = new Employee();
		ep.name = "라이츄";
		ep.age = 50;
		ep.department = "홍보";
		System.out.println(ep.info());

	}
}