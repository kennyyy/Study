package quiz15;

public class MainClass {

	public static void main(String[] args) {
		Circle c = new Circle("원", 5);
		System.out.println(c.getName());
		System.out.println("원의 넓이 : "+c.getArea());
		
		Rect r = new Rect("사각형", 5);
		System.out.println(r.getName());
		System.out.println("사각형의 넓이 : "+r.getArea());

	}

}
