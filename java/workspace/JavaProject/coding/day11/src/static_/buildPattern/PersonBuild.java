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
	
	//���� ����ϱ� ���� �޼���
	@Override
	public String toString() {
		return "PersonBuild [name=" + name + ", age=" + age + "]";
	}
	
	//���������� set�޼��常 �����Ͽ� ���(�ڽ��� �����ϵ��� ó��)
	public PersonBuild setAge(int age) {
		this.age = age;
		return this;
	}
	
	public PersonBuild setName(String name) {
		this.name = name;
		return this;
	}
	
	//������ ���� �޼��� (��ü����)
	public static PersonBuild builder() {
		return new PersonBuild();
	}
	
	//���带 ���� ���� ��ü�� ��ȯ�ϱ� ���� �޼���
	public PersonBuild build() {
		return new PersonBuild(this.name, this.age);
	}
	
	
}
