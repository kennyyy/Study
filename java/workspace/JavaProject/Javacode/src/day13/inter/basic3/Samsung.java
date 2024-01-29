package day13.inter.basic3;

public class Samsung implements Printed {
	
	public String name = "Samsung!";
	@Override
	public void turnOn() {
		System.out.println(name + "켭니다");
	}
	@Override
	public void turnOff() {
		System.out.println(name + "끕니다");
	}

	@Override
	public void print(String document) {
		
		System.out.println(document);
		
	}

	@Override
	public void colorPrint(int color, String document) {
		
		System.out.println(color + "색 출력:" + document);
		
	}

	@Override
	public int copy(int n) {
		for(int i = 1; i <= n; i++) {
			System.out.println(i + "번째 복사 중입니다.");
		}
		return n;
	}

}
