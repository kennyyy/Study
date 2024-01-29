package static_.buildPattern;

public class PersonBuild {
	
	private String name;
	private int age;
	
	private PersonBuild() {
		
	}
	private PersonBuild(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	//값을 출력하기 위한 메서드
	@Override
	public String toString() {
		return "PersonBuild [name=" + name + ", age=" + age + "]";
	}
	
	//빌드패턴은 set메서드만 생성하여 사용(자신을 리턴하도록 처리)
	public PersonBuild setAge(int age) {
		this.age = age;
		return this;
	}
	
	public PersonBuild setName(String name) {
		this.name = name;
		return this;
	}
	
	//생산을 위한 메서드 (객체생성)
	public static PersonBuild builder() {
		return new PersonBuild();
	}
	
	//빌드를 통해 최종 객체를 반환하기 위한 메서드
	public PersonBuild build() {
		return new PersonBuild(this.name, this.age);
	}
	
	
}
