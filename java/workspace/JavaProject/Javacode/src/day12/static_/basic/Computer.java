package day12.static_.basic;

//정적 초기화자 static initializer
public class Computer {
	public static String company;// = "LG";//이렇게 초기값을 바로 대입해 줘도 된다.
	public int price;
	
	//정적 초기화자 - 단 번만 실행됩니다.
	static {
		//this.company = "LG";//this사용불가 static은 객체와 다른 메모리 공간을 사용하기 때문.
		company = "LG";
		
		System.out.println("정적초기화자 1번 실행됨");
	}
	
	public Computer(int price) {
		this.price = price;
		//this.company = "LG";//이 방식은 객체가 생성될때마다 이 값으로 값의 대입이 일어나서 static를 사용하는 의미가 희미해짐
	}
	
	public static void main(String[] args) {
		//정적 초기화자 클래스가 불려나올때 단 1번만 실행.
		//Computer com1 = new Computer(1000);
		//Computer com2 = new Computer(2000);						
		//Computer com3 = new Computer(3000);
		
		System.out.println(Computer.company);
		
		
	}
	
	
}
