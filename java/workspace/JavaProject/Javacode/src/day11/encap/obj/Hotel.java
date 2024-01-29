package day11.encap.obj;

public class Hotel {
	//클래스안에 객체(클래스도 참조타입이기 때문에 당연히 가능하다.)
	//ex) String도 참조타입이라서 클래스안에서 막쓰지 않는가? 당연히 사용 가능한 것이다.
	Chef chef;
	
	//생성자
	//호텔이 생성될 때 초기값을 갖는다.
	public Hotel() {
		//chef.cooking();// X 메모리 할당 안받음
		this.chef = new Chef(); //Chef 객체 생성에 메모리를 할당 받아야 사용 가능한다
	}
	
	//객체를 매개변수로 받는 setter
	public void setChef(Chef chef) {
		this.chef = chef;
	}
	
	//객체를 반환하는 getter
	public Chef getChef() {
		return chef;
	}
	
	
	
	
	
	
	
	
	public static void main(String[] args) {
		//호텔객체생성
		Hotel hotel = new Hotel();
		
		//getter메서드의 사용법
		Chef chef = hotel.getChef();
		chef.cooking();
		
		//setter메서드의 사용법 1
		hotel.setChef(new Chef());//메모리에 할당받아서 참조값을 넘김
		hotel.chef.cooking();
		
		//setter메서드의 사용법 2
		Chef c = new Chef();
		hotel.setChef(c);
		hotel.chef.cooking();
		
	
		
	}
}
