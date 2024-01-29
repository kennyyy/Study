package api.thread.runable;

public class MainClass2 {

	public static void main(String[] args) {
		//객체 1개, 쓰레는 2개 생성
		
		ThreadTest t = new ThreadTest();
		
		Thread thread1 = new Thread(t, "A");
		Thread thread2 = new Thread(t, "B");
		
		thread1.start();
		thread2.start();

	}

}
