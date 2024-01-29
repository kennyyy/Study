package day04;

public class MultiForEx01 {
	public static void main(String[] args) {
		//중첩반복문의 순서
		//내부 반복문이 9번 돌면 외부 반복문 한번 돌아가는 구조
		for(int i = 1; i <= 9; i++) {
			for(int j = 1; j<=9; j++) {
				System.out.print(i + " - " + j + "  ");
			}
			System.out.println("");
		}
		
	}
}
