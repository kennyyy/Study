package completequiz01;

public class Quiz13 {
	public static void main(String[] args) {
		System.out.println("거꾸로 실행되는 랜덤 구구단^0^");
		
		int random = (int)(Math.random() * 9) + 1;
		
		System.out.println("구구단 " + random + "단");
		for(int i = 9; i>=1; i--){
			System.out.println(random + " X " + i + " = " + random*i);
		}
	}
}
