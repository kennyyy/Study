package quiz24;

public class Download implements Runnable{
	String str = "";
	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i = 0; i < 10; i++) {
			str += "*";
			System.out.println("동영상을 다운로드 합니다 : " + str);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		System.out.println("다운로드가 완료되었습니다.");
		
		
	}


	
	
}
