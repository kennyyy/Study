package completequiz01;

import java.util.Scanner;

public class Quiz05 {
	public static void main(String[] args) {
		//입력을 1개 받아서 짝수, 홀수, 0,음수 조건나누기
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수를 입력하세요 > ");
		int num = sc.nextInt();
		
		if(num % 2 == 0 && num > 0) {
			if (num == 0) {
				System.out.print(num + "은 0 입니다.");
			}else {
				System.out.print(num + "은 짝수 입니다");
			}
		}else if(num % 2 == 1) {
			System.out.print(num + "은 홀수 입니다");
		}else {
			System.out.print(num + "은 음수 입니다.");
		}
	}	

}
