package quiz15;

public class Circle extends Shape {
	/*
	 * 1. 원 생성될 때, 도형이름과, 반지름을 받아서 초기화
	 * 2. getArea()는 원의 넓이 반환
	 * 3. main에서 사용하기
	 */
	
	private int radius; //반지름
	
	public Circle(String name, int radius) {
		super(name);
		this.radius = radius;
	}

	@Override
	public double getArea() {
		return this.radius * this.radius * PI;
	}
	
	

	
}
