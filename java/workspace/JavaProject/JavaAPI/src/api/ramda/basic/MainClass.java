package api.ramda.basic;


public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person p = new Person();
		//익명 객체 방법
		p.greeting(new Say01() {
			
			@Override
			public void talking() {
				// TODO Auto-generated method stub
				System.out.println("Hello");
			}
		});
		
		p.greeting(new Say01() {
			
			@Override
			public void talking() {
				// TODO Auto-generated method stub
				System.out.println("안녕하세요");
			}
		});
		p.greeting(new Say01() {
			
			@Override
			public void talking() {
				// TODO Auto-generated method stub
				System.out.println("니쉬팔로마");
			}
		});
		
		System.out.println("-------------------------");
		
		//함수적 인터페이스를 구현하는 익명객체를 -> 람다식으로 표현이 기능하다.
		//람다식 방법
		p.greeting(() -> {
			System.out.println("Hi~");
		});
		p.greeting(() -> System.out.println("안녕하세요~"));//표현할 코드가 한줄이면 {} 생략이 됩니다.
	
		System.out.println("-------------------------");
	
		
		String hi = p.greeting(new Say02() {
			@Override
			public String talking() {
				return "hello";
			}
		});
		
		System.out.println(hi);
		String r = p.greeting(() -> "hello" );//한줄이면서, return을 생략하면 자동으로 return이 됩니다.
		System.out.println(r);
		

		System.out.println("-------------------------");
		
		int r2 = p.greeting(new Say03() {
			
			@Override
			public int talking(String a, int b) {
				//처리할 코드
				int sum = 0;
				for(int i = 0; i <= b; i++) {
					sum += i;
					a += a;
				}
				return sum;
			}
		});
		int r3 = p.greeting((a, b) -> { //자동타입추론 ()안에는 타입을 생략합니다. 매개변수가 1개라면 ()도 생략가능합니다.
			//처리할 코드
			int sum = 0;
			for(int i = 0; i <= b; i++) {
				sum += i;
				a += a;
			}
			return sum;
		});
		
	
		
	}

}
