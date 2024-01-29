package thread.ex06_yieid;

public class TestB implements Runnable{

	@Override
	public void run() {
		
		while(true) {
			
			System.out.println("B쓰레드가 실행");
			
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {}
		}
			
			
		
	}

	
}
