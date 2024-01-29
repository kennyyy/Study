package quiz10;

public class User {
	private String name;
	private int rrn;//주민등록번호
	private int age;
	
	//생성자, getter, setter 생성하면 됩니다.
	public User() {
		
	}
	
	public User(String name, int rrn, int age) {
		super();
		this.name = name;
		this.rrn = rrn;
		this.age = age;
	}

	
	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getRrn() {
		return rrn;
	}


	public void setRrn(int rrn) {
		this.rrn = rrn;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}
	void info() {
		System.out.println("이름 : " + name + "  주민번호 : " + rrn + "  나이 : " + age);
	}

}
