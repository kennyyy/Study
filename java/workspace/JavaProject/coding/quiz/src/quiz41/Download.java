package quiz41;

public class Download implements Runnable{

	int finish = 10;
	
	@Override
	public void run() {
		
		System.out.print("동영상을 다운로드 합니다:");
		for(int i = 1; i <= finish; i++) {
			
			System.out.print("*");
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {}
			
		}
		System.out.println("\n다운로드가 완료되었습니다");
	}

	
	
}
