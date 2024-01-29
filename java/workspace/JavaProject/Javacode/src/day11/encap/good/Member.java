package day11.encap.good;

public class Member {
	//특정 알고리즘 가진 클래스가 아니고, 단순히 값을 저장하는 용도의 클래스
	//기본생성자, get setter , 매개변수값 생성자 자동생성하는 방법을 알아보자.
	
	//Alt + Shift + s -> Generate getters and setters를 사용해 자동 생성가능
	private String id;
	private String name;
	private String email;
	private int age;
	private String phone;
	private String address;
	
	//기본생성자 자동생성
	//ctrl + space + enter 
	public Member() {
		// TODO Auto-generated constructor stub
	}
	
	//모든 멤버변수를 매개값으로 받는 생성자
	//Alt + Shift + s -> Generate Constructor using Fields를 사용해 자동 생성가능
	public Member(String id, String name, String email, int age, String phone, String address) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.age = age;
		this.phone = phone;
		this.address = address;
	}
	//....
	
	public String getId() {
		return id;
	}


	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
}
