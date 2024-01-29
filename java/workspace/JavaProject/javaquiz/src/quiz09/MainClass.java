package quiz09;


public class MainClass {

	public static void main(String[] args) {
		MyCart mc = new MyCart(2000);
		mc.buy("tv");
		mc.buy("radio");
		mc.buy("computer");
		mc.buy("tv");
		mc.buy("tv");
		mc.buy("tv");
		
		mc.info();

	}

}
