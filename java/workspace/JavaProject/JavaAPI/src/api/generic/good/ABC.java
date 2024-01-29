package api.generic.good;


public class ABC<T> {
	//<타입> 처럼 사용함
	private T t;
	
	public T getT() {
		return t;
	}


	public void setT(T t) {
		this.t = t;
	}






	public static void main(String[] args) {
		//제네릭으로 클래스를 설계하고 <타입>명시없이 사용하면 모두가 사용할 수 있는 Object가 제네릭 타입이 된다.
		//ABC abc = new ABC();
		//abc.setT("홍길동");
		
		//String을 저장하는 용도의 객체
		ABC<String> abc = new ABC<String>();
		abc.setT("홍길동");
		
		String name = abc.getT();
		System.out.println(name);
		
		//int로 저장하는 용도의 객체 (반드시 wrapper만 쓸 수 있습니다.)
		ABC<Integer> abc2 = new ABC<>();
		abc2.setT(23);
		
		int age = abc2.getT();
		System.out.println(age);
		
		ABC<Person> abc3 = new ABC<Person>();
		abc3.setT(new Person());
		Person p = abc3.getT();
	}

}
