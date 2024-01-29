package day14.exception.trycatch;

public class TrycatchEx01 {

	public static void main(String[] args) {
		
		int x = 10;
		int y = 0;
		
		try {
			
			System.out.println(x + y);
			
			System.out.println(x / y);
			
			System.out.println(x * y);
			
			
		} catch (Exception e) {
			System.out.println("0으로 나누지 마세요!");
		}
			
		
	}
}
