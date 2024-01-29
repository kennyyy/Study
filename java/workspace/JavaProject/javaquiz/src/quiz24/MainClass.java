package quiz24;

public class MainClass {

	public static void main(String[] args) {
		
		//힌트 - 2개의 객체, 2개의 쓰레드
		
		Video v = new Video();
		Download d = new Download();
		
		Thread t = new Thread(v);
		Thread t2 = new Thread(d);
		t.start();
		t2.start();
		
		
		
		
		
		
		
		
		
		
	}
}
