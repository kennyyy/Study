package day13.inter.basic3;

public class Lg implements Printed {

	public String name = "Life is good";
	
	@Override
	public void turnOn() {
		System.out.println(name);
	}

	@Override
	public void turnOff() {
		System.out.println(name);
		
	}

	@Override
	public void print(String document) {
		System.out.println(name);
		System.out.println(document);
	}
	@Override
	public void colorPrint(int color, String document) {
		System.out.println(name);
		System.out.println("색상:" + color);
		System.out.println(document);
	}
	@Override
	public int copy(int n) {
		System.out.println(name);
		System.out.println(n + "장 복사 완료");
		return n;
	}

}

