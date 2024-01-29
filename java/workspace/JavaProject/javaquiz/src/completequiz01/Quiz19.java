package completequiz01;

import java.util.Scanner;

public class Quiz19 {

	public static void main(String[] args) {
		//updown 게임
		//1~100까지 임의의 랜덤한 정수가 결정되고, 정답을 맞추는 프로그램
		Scanner sc = new Scanner(System.in);
		
		
		int random = (int)(Math.random() * 100) + 1;
		int count = 0;
		while(true) {
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
		}
		
		System.out.println("시도횟수 : " + count);
	}

}
