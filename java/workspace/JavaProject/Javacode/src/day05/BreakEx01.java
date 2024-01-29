package day05;

import java.util.Scanner;

public class BreakEx01 {
	public static void main(String[] args) {
		//break문 반복문을 빠져나오고 싶을 때 사용합니다
		for(int i = 1; i<=10; i++) {
			if(i == 5) {
				break;
			}
			System.out.print(i + " ");
		}
		System.out.println("\n------------------");
		//무한 반복문
		//반복횟수를 정확히 모르고 있을 때, break로 빠져나오는 현태로 사용됩니다.
		//자바에서 무한반복은 while(true)를 사용합니다.
		
		int i = 1;
		while(true) {
			System.out.print(i + " ");
			if(i==10)
				break;
			i++;
		}
		System.out.println("\n------------------");
		
		//사용자가 입력한 값이 0 일 때 까지, 입력을 계속 받기
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.print(">");
			int a = sc.nextInt();
			if(a == 0) {
				System.out.println("그만!");
				break;
			}
		}
		
	}

}
