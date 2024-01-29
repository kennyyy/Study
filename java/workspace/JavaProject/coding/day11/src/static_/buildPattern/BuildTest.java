package static_.buildPattern;

public class BuildTest {

	public static void main(String[] args) {
		//객체의 사용
		PersonBuild p1 = PersonBuild.builder().setAge(20).build();
		System.out.println(p1.toString());
		
		//객체의 사용
		PersonBuild p2 = PersonBuild.builder()
									.setAge(30)
									.setName("홍길동")
									.build();
		System.out.println(p2.toString());
		
		//값으변경
		p2.setAge(50).setName("홍길자");
		System.out.println(p2.toString());
		
		
		
		
		
	}
}
