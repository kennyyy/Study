package api.lang.object;

public class Person implements Cloneable {

	private String name;
	
	public Person(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	//alt + shift + s
	@Override
	public String toString() {
		return "이름:" + name;
	}

	@Override
	public boolean equals(Object obj) {
		
		if(obj instanceof Person) {
			Person p = (Person)obj;
			
			if(p.getName().equals(this.name) ) {
				System.out.println("이름이 같음");
				return true;
			}
		}
		return false;
	}

	@Override
	protected void finalize() throws Throwable {
		//생성된 객체가 사라지는 시점에서 자동 실행
		System.out.println(this.name + "님이 소멸되었습니다");		
	}
	
	//객체 복사 메서드
	//protected제어자 이기 때문에, 사용해 주려면 오버라이딩을 통해 생성해 줘야한다.
	//또한 cloneable 인터페이스를 구현해서 사용해야합니다
	@Override
	protected Object clone() throws CloneNotSupportedException {
		
		return super.clone();
	}
	
	
	
	
	
	
	
}
