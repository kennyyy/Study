package quiz19;

import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {
		//updown 게임
		//1~100까지 임의의 랜덤한 정수가 결정되고, 정답을 맞추는 프로그램
		//입력값이 정수가 아닐경우 예외처리를 해주세요
		Scanner sc = new Scanner(System.in);
		
		
		int random = (int)(Math.random() * 100) + 1;
		int count = 0;
		while(true) {
			try {
				System.out.print("정답 입력 ("+ random +") >");
				int num = sc.nextInt();
				count++;
				if(random > num) {
					System.out.println("더 큰 수를 입력하세요");
				}else if(random < num) {
					System.out.println("더 작은 수를 입력하세요");
				}else {
					System.out.println("정답입니다.");
					break;
				}
			}catch (Exception e) {
				System.out.println("정수만 입력해 주세요.");
				sc.nextLine(); //문자열제거 + 엔터값 제거
			}
			
		}

	}

}
