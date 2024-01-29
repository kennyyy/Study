package quiz22;

public class Data {

	private String name;
	private int age;
	private String email;
	private String region;
	
	public Data() {
	}

	public Data(String name, int age, String email, String region) {
		super();
		this.name = name;
		this.age = age;
		this.email = email;
		this.region = region;
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

	public String getRegion() {
		return region;
	}

	public void setRegion(String region) {
		this.region = region;
	}

	@Override
	public String toString() {
		return "Data [name=" + name + ", age=" + age + ", email=" + email + ", region=" + region + "]";
	}
	
	
	
	
	
	
}
