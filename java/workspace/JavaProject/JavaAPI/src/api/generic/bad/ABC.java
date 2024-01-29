package api.generic.bad;


public class ABC {
	//무엇이든 저장할 수 있는 상자
	private Object obj;
	public void setObj(Object obj) {
		this.obj = obj;
	}
	public Object getObj() {
		return obj;
	}
	
	public static void main(String[] args) {
		ABC abc = new ABC();
		
		//반드시 타입에 맞게 캐스팅해줘야한다.
		abc.setObj("피카츄");
		String str = (String)abc.getObj();
		
		//만약 사용할 때 잘못캐스팅 하면 예외가 발생.
		//Integer age = (Integer)abc.getObj();
		
		//반드시 타입에 맞게 캐스팅해줘야한다.
		abc.setObj(new Person());
		Person p = (Person)abc.getObj();
		
		
	}

}
