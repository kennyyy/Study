package api.thread.thread;

public class ThreadTest extends Thread{
	int num;
	@Override
	public void run() {
		for(int i = 1; i <= 10; i++) {
			if(getName().equals("A")) {
				num++;
			}
			System.out.println("쓰레드이름:" + getName() + ", 합계:" + num);
		}
		try {
			sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	

}
