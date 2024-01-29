package api.anomymous.basic2;

public class MainClass {
	public static void main(String[] args) {
		Tv tv = new Tv();
		
		RemoteControl rm = tv.getRemote();
		rm.turnOff();
		rm.volumeUp();
		rm.volumeDown();
		rm.turnOn();
	}
}
