package quiz21;

public class User {
	private String name;
	private int age;
	private String email;
	private String city;
	public User() {
		// TODO Auto-generated constructor stub
	}
	public User(String name, int age, String email, String city) {
		super();
		this.name = name;
		this.age = age;
		this.email = email;
		this.city = city;
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
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	
	
	

}
