package api.collection.queue;

public class Person implements Comparable<Person>{

	private String name;
	private int age;
	
	public Person() {
	}

	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	//비교의 우선순위를 주기위한 메서드
	@Override
	public int compareTo(Person o) {
		//문자비교
		//return name.compareTo( o.getName() ) ;
		//return o.getName().compareTo(name);
		
		//Integer 비교
		return Integer.compare(age, o.getAge());//오름차순
		//return Integer.compare(o.getAge(), age);//내림차순
	}

	//오버라이딩 toString - 객체의 멤버변수를 빠르게 확인
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}

	
}
