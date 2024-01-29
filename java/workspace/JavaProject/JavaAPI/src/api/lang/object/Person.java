package api.lang.object;

public class Person implements Cloneable{
	private String name;
	
	public Person(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	//오버라이딩 - 객체안에 변수를 빠르게 확인하기 위해서 오버라이딩해서 많이 사용함
	@Override
	public String toString() {
		return "Person [name = " + name + "]";
	}
	
	//오버라이딩 - obj가 Person인 경우, 매개변수의 name과 나의 name이 같으면 true반환
	@Override
	public boolean equals(Object obj) {
		
		if(obj instanceof Person) {
			Person p = (Person)obj;
			return this.name.equals(p.getName());
		}
		return false;
	}
	//finalize - deprecate(언제 없어질지 모르니 웬만하면 사용하지 마세요)
	//오버라이딩 - 객체가 메모리에서 해제될 때 자동으로 불려나가는 메서드
	@Override
	protected void finalize() throws Throwable {
		System.out.println(this.name + "님이 소멸했습니다.");
		super.finalize();
	}
	
	//오버라이딩 - 객체를 복사해서 반환(얇은 복사)
	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
	
	

	

}
