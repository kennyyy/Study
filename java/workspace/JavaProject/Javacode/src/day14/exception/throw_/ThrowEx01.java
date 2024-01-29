package day14.exception.throw_;


public class ThrowEx01 {

	public static void main(String[] args) {	
		// throw - 예외 강제로 발생시키기
		//메서드나 생성자에서 throw new 예외클래스()
		//를 만나면 예외가 생성됩니다. 
		
		//throw키워드를 만나면 try~catch문장이나 throws 키워드로 예외처리를 진행해야 합니다.
		//throw특정조건과 함께 catch문장으로 프로그램 실행을 옮길 때 사용가능합니다.
		
		try {
			int result = calc(-10);
		} catch (Exception e) {
			//System.out.println( e.getMessage() ); //예외 발생시 예외객체가 가지고 있는 메시지를 얻는 기능
			e.printStackTrace();
			//예외 경로를 추적하는 메시지를 출력하는 용도로 많이 사용됩니다. //종료된게 아님
			//예외 원인을 찾을 때, 개발시에 매번 사용됩니다.
		}
		System.out.println("프로그램 정상종료");
		
	}
	public static int calc(int n) throws Exception{
		if( n < 0 ) {
			throw new Exception("음수를 왜 넘겼어 이쒸 ㅡㅡ");
		}
		
		
		int sum = 0;
		for(int i = 1; i <= n; i++) {
			sum += i;
		}
		
		return sum;
	}
	

}
