package anonymous.basic02;

public class MainClass {

	public static void main(String[] args) {
		
		Computer com = new Computer();
		//com.setRemote(new 익명객체);
		
		com.getRemote().turnOn();
		com.getRemote().volumeUp();
		com.getRemote().volumeDown();
		com.getRemote().turnOff();
		
		Tv tv = new Tv();
		tv.getRemote().turnOn();
		tv.getRemote().volumeUp();
		tv.getRemote().volumeDown();
		tv.getRemote().turnOff();
		
		
	}
}
