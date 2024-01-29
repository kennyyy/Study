package api.anomymous.basic;

interface Car {
	public void run ();
}

public class Garage {

	public Car car = new Car() {
		
		//Car인터페이스 상속받는 클래스(딱 한번만 사용하고, 더 이상 사용하지 않을 클래스는 익명객체로 생성 할 수 있습니다.)
		//꼭 여기서 만이 아니라, 생성자, 메서드안 어디서든 사용 가능하다.
		@Override
		public void run() {
			System.out.println("this is anomymous");
			
		}
	};
	
	
	
	
	
	//Car인터페이스를 상속받는 클래스 3개를 생성하고 초기화시키세요
	

}
