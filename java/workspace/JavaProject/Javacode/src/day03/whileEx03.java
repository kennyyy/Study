package day03;

import java.util.Scanner;

public class whileEx03 {
	public static void main(String[] args) {
		//첫번째 줄에 정수가 입력이 들어옵니다.
		//입력받은 정수만큼 다시한번 입력받음.
		//그리고 합을 구한다.
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 입력 > ");
		int n = sc.nextInt();
		
		int i = 1;
		int sum = 0;
		while(i <= n) {
			
			System.out.print("> ");
			int x = sc.nextInt();
			sum += x;
			
			i++;
		}
		System.out.println("합은 : " + sum);
		

	}

}
