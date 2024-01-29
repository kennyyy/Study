package quiz15;

public abstract class Shape {
	
	//멤버변수
	private String name;
	public static final double PI = 3.14;
	
	//생성자
	public Shape(String name) {
		this.name = name;
	}
	
	//오버라이딩을 강제할 메서드는 추상메서드로 선언
	public abstract double getArea();
	
	
	//오버라이딩을 강제화 하지 않는다면 일반메서드로 선언
	public String getName() {
		return "도형이름:" + name; 
	}
	
	
}
