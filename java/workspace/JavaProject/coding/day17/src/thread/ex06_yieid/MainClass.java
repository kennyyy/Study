package thread.ex06_yieid;

public class MainClass {

	public static void main(String[] args) {
		
		TestA a = new TestA();
		TestB b = new TestB();
				
		Thread t1 = new Thread(a);
		Thread t2 = new Thread(b);

		t1.start();
		t2.start();
		//쓰레드 yieId() - 다른 쓰레드에게 양보
		try {
			
			Thread.sleep(3000);//3초뒤 TestB만 실행
			a.work = false;
						
			Thread.sleep(3000);//3초뒤 다시 동시 실행
			a.work = true;
			
			
		} catch (Exception e) {}

		
		
		
		
		
		
		System.out.println("main종료");
	}
}
