package thread.ex07_join;

public class MainClass {

	public static void main(String[] args) {
		
		TestA a = new TestA();
		Thread t = new Thread(a);
		
		t.start();
		
		try {
			t.join(); //join() 메서드는 해당 스레드가 종료될때 까지 다른스레드를 정지 시킵니다.
		} catch (InterruptedException e) {}
		
		
		System.out.println("계산결과:" + a.getSum());
	}
}
