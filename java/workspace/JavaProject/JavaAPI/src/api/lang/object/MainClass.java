package api.lang.object;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person p  = new Person("홍길동"); //객체1
		String str = p.toString();
		System.out.println(str);
		
		int hash = p.hashCode();
		//해시알고리즘을 사용해서
		//객체의 고유한 주소에 따라서 중복없는 고유한 숫자를 반환
		System.out.println(hash);
		System.out.println("--------------------");
		
		Person p2 = new Person("홍길동"); //객체2
		//동일한 객체인지 확인
		boolean result = p.equals(p2);
		System.out.println(result);
		
		System.out.println("--------------------");
		
		try {
			Person o = (Person)p.clone();
			System.out.println(o.hashCode());
			System.out.println(p.hashCode());
			
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
}
