package thread.ex07_join;

public class TestA implements Runnable{
	
	private int sum;
	
	@Override
	public void run() {
		
		for(int i = 1; i <= 100; i++) {
			sum += i;
			System.out.println("A누적합:" + sum);
			try {
				Thread.sleep(100);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

	//게터
	public int getSum() {
		return sum;
	}
	

}
