package api.thread.runable;

public class ThreadTest implements Runnable{
	int num;
	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i = 1; i <= 10; i++) {
			
			Thread t = Thread.currentThread(); //현재동작되는 쓰레드 반환
			if( t.getName().equals("A")) {//현재 쓰레드의 이름을 받아옴
				num++; //A쓰레드인 경우 num를 올린다.
			}
			System.out.println("쓰레드이름:" + t.getName() + ", 합계:" + num);
			//쓰레드 일시정지
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
		
		}
		
	}

}
