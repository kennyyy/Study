package quiz24;

public class Video implements Runnable{
	@Override
	public void run() {
		for(int i = 0; i < 15; i++) {
			System.out.println("링딩동~!");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		System.out.println("음악 재생이 끝났습니다.");
		
		
		
	}
	
	
	
}
