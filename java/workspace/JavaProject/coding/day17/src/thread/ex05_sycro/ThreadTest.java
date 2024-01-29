package thread.ex05_sycro;

public class ThreadTest implements Runnable {

	int testNum = 0;
	
	@Override
	public synchronized void run() {
		for (int i = 0; i < 10; i++) {
			if(Thread.currentThread().getName().equals("A")) {
				System.out.println("====================================");
				testNum++;
			}
			System.out.println("쓰레드이름 : " + Thread.currentThread().getName() + ", testNum : " + testNum);
			try {
				Thread.sleep(500);
			} catch (Exception e) {}
		}
	}

}
