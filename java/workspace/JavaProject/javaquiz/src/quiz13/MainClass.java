package quiz13;

public class MainClass {

	public static void main(String[] args) {
		//카트생성
		MyCart mc = new MyCart(3000);
		
		mc.buy(new Tv());
		mc.buy(new Tv());
		mc.buy(new Computer());
		mc.buy(new Tv());
		mc.buy(new Radio());
	
		mc.info();
	}

}
