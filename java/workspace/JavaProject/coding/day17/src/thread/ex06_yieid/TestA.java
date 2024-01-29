package thread.ex06_yieid;

public class TestA implements Runnable{

	public boolean work = true;
	
	@Override
	public void run() {
		
		while(true) {
			if(work) {
				System.out.println("A쓰레드가 실행");
				
			} else {
				Thread.yield(); //실행양보
			}
			
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {}
			
		}
		
	}

	
}
