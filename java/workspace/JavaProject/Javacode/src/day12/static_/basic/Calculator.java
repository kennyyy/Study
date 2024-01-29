package day12.static_.basic;

public class Calculator {
	//객체에서 서로 다른값을 가져야 하는 경우는 일반 멤버변수가 됩니다.
	
	private int result;
	private String color;
	
	//객체마다 동일한 값을 가져야하는 경우는 static변수가 됩니다.
	public static double pi = 3.14;

	/*
	 * 일반 변수를 참조하는 메서드는 일반메서드 됩니다. (static x) 
	 */
	public int getResult() {
		return result;
	}

	public void setResult(int result) {
		this.result = result;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	
	//메서드 안에서 일반 멤버변수를 쓰지 않고, 범용성있게 사용할 메서드는 static을 붙이면 됩니다.
	//원의 넓이
	//static을 안쓰면 객체를 생성해서 메서드를 사용해야한다.
	public static double circle(int radius) {
		return radius * radius * pi;
	}
	public static double getPi() {
		return pi;
	}

	public static void setPi(double pi) {
		Calculator.pi = pi;
	}
	
	void add(int n) {
		this.result += n;
	}
	
}
