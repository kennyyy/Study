package inter.baisc3;

public class Samsung implements Printed {

	public String name = "Samsung";
	
	@Override
	public void turnOn() {
		System.out.println(name);
		System.out.println("전원을 켭니다");
	}

	@Override
	public void turnOff() {
		System.out.println(name);
		System.out.println("전원을 끕니다");
		
	}

	@Override
	public void print(String document) {
		
		System.out.println(name);
		System.out.println(document);
	}

	@Override
	public void colorPrint(String document, String color) {
		
		System.out.println(name);
		System.out.println(color + "색출력:" + document);
	}

	@Override
	public int copy(int n) {
		
		for(int i = 1; i <= n; i++) {
			System.out.println(i + "장 복사 완료");
		}
		
		return n;
	}

}
