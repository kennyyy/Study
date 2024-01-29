package day12.poly.basic2;

//여기가 메인 나머지는 super_에서 끌어온것
public class MainClass {

	public static void main(String[] args) {
		
		Student s1 = new Student("홍길자", 20 ,"1234123");
		Student s2 = new Student("김길자", 30 ,"2244123");
		Student s3 = new Student("이길자", 40 ,"5223123");
		
		Teacher t1 = new Teacher("피카츄", 20 ,"언제");
		Teacher t2 = new Teacher("라이츄", 20 ,"까지");
		
		Employee e1 = new Employee("손흥민", 30, "토트넘");

		Student[] arr1 = {s1, s2, s3};
		Teacher[] arr2 = {t1, t2};
		Employee[] arr3 = {e1};
		
		
		for(Student s : arr1) {
			System.out.println(s.info());
			System.out.println(s);
		}
		System.out.println("----------------------------------");
		
		//다형성 적용(부모타입으로 자동 형변환)
		Person ss1 = new Student("홍길자", 20 ,"1234123");
		Person ss2 = new Student("김길자", 30 ,"2244123");
		Person ss3 = new Student("이길자", 40 ,"5223123");
		
		Person tt1 = new Teacher("피카츄", 20 ,"언제");
		Person tt2 = new Teacher("라이츄", 20 ,"까지");
		
		Person ee1 = new Employee("손흥민", 30, "토트넘");
		
		Person[] arr4 = {ss1, ss2, ss3, tt1, tt2, ee1};
			
		for(Person p : arr4) {
			System.out.println(p.info());//오버라이드 되었으면 먼저실행됨
			System.out.println(p);
		}
		System.out.println("----------------------------------");
		
		//House객체를 사용하고 싶다.
		House house = new House();
		house.printPerson(ss1); //인자 Person p
		house.printPerson(arr4);//인자 Person[] p
		
		house.addPerson(ss1);
		house.addPerson(ss2);
		
		
		//////////////////////////////////////////////
		//instanceOf확인
		System.out.println("----------------------");
		
		Teacher s23 = (Teacher) new Person();
		
		personInfo(e1);
	}
		
		
	//instanceOf확인
	public static void personInfo(Person p) {
		if( p instanceof Student) { //p가 Student타입이면 true;
			Student s = (Student)p;
			System.out.println(s.info());
		}else if( p instanceof Employee) { //p가 Employee타입이면 true;
			Employee e = (Employee)p;
			System.out.println(e.info());
		}else if( p instanceof Teacher) {//p가 Teacher타입이면 true;
			Teacher t = (Teacher)p;
			System.out.println(t.info());
		}
		
		
	}
		
		
		
		
	

}
