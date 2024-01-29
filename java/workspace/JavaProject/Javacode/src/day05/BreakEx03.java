package day05;

public class BreakEx03 {

	public static void main(String[] args) {
		//반복문 탈출 방법 두가지
		//1.boolean 값을 이용한 반복문 탈출(중첩반복문에서)
		
		boolean bool = false;
		int value = 0;
	
		for(int i = 1; i <= 10; i++) {
			for(int j= 1; j <= 10; j++) {
				if(j == 5) {
					bool = true;
					value = j;
					break;
				}
			}
			if(bool) {
				System.out.println(value);
				break;
			}
		}
		System.out.println("---------------");
		
		//2.중첩반복문시에 이름붙여서 한방에 탈출하기
		//Labeled Loop
		escape:for(int i = 1; i <= 10; i++) {
			for(int j= 1; j <= 10; j++) {
				System.out.println(i + " - " + j);
				if(j == 5) {
					break escape;
				}
				
			}
			
		}

	}

}
