package quiz15;

public class Rect extends Shape {
	/*
	 * 1. 사각형은 생성될 때, 도형이름과, 변의길이를 받아서 초기화
	 * 2. getArea()는 사각형의 넓이 반환
	 */
	private int side; //변의길이
	
	public Rect(String name, int side) {
		super(name);
		this.side = side;
		
	}

	@Override
	public double getArea() {
		return this.side * this.side;
	}

	
}
