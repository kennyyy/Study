package anonymous.basic;

interface Car {
	public void run();
}

class Tico implements Car{

	public void run() {
		System.out.println("티코~");
	}
	
}

//클래스
public class Garage {
	
	//멤버변수
//	public Car car = new Tico();
	
	public Car car = new Car() {
		
		@Override
		public void run() {
			System.out.println("익명객체 티코 입니다");
		}
	};
	
	
}
