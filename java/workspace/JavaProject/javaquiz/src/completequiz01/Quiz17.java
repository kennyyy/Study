package completequiz01;

import java.util.Scanner;

public class Quiz17 {
	public static void main(String[] args) {
		
		//1.짝수 줄은 공백 홀수줄은 짝수로 별을 찍어보자
		for(int i = 1 ; i <= 6; i++) {
			for(int j = 1; j <= 4; j++) {
				if(i % 2 == 0) {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
				
			}
			System.out.println();
		}
		System.out.println("---------------");
		
		//2.안이 비어있는 별 찍기
		Scanner sc = new Scanner(System.in);
		System.out.print("가로 > ");
		int a = sc.nextInt();
		System.out.print("세로 > ");
		int b = sc.nextInt();
		
		for(int i = 0; i < b; i++) {
			for(int j = 0; j < a; j++) {
				if((i >= 1 && i <= b-2) && (j >= 1 && j <= a-2)) {
					System.out.print(" ");
				}else {
					System.out.print("*");
				}	
			}
			System.out.println();
		}
		System.out.println("---------------");
		
		//3.바깥 반복회전수에 따라서, 내부 반복의 횟수가 달라지는 경우
		//바깥 반복문 - 행, 내부반복문이 출력
		
		//i = 1, j= 1바퀴
		//i = 2, j= 2바퀴
		//i = 10, j= 10바퀴
		
		for(int i = 1; i <= 5; i++) {
			for(int j = 1; j <= i ; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("---------------");
		
		int star = 5;
		for(int i = 1; i <= star; i++) {
			for(int j = 1; j <= star-i+1; j++) {
				System.out.print("☆");
			}
			System.out.println();
		}
		
		System.out.println("---------------");
		
		star = 5;
		for(int i = 0; i < star; i++) {
			for(int j = 0; j < star-i-1 ; j++) {
				System.out.print(" ");
			}
			for(int j = 0; j < i*2+1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
