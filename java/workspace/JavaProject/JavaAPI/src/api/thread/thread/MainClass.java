package api.thread.thread;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//메인도 하나의 쓰레드로 동작을 합니다.
		
		//쓰레드를 동작시키려면 Thread객체를 생성합니다.
		
		//객체 2개, 쓰레드 2개 (각각 실행됨)
		ThreadTest t = new ThreadTest();
		t.setName("A");
		
		t.start();
		
		
		
		
		System.out.println("메인 쓰레드 종료");
		
	}

}
