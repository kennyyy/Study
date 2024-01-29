package api.thread.sync;

public class MainClass {

	public static void main(String[] args) {
		
		// 동기화 - 한번에 하나의 작업
		// 비동기화 - 한번에 여러개의 작업을 동시에 진행함
		
		//스레드가 사용중인 객체를 다른 스레드가 변경할 수 없도록 할 때
		//객체에 lock을 걸어 다른 스레드가 건들 수 없도록 할 수 있습니다
		//동기화 시켜주는 키워드 synchronized
		
		ThreadTest t = new ThreadTest();
		
		Thread thread1 = new Thread(t, "A");
		Thread thread2 = new Thread(t, "B");
		
		thread1.start();
		thread2.start();
		
		System.out.println("main스레드 종료");
	}
}
