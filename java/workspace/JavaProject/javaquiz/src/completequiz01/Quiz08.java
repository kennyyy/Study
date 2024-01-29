package completequiz01;

import java.util.Scanner;

public class Quiz08 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수를 입력하세요 > ");
		int num = sc.nextInt();
		System.out.println("구구단 : " + num+ "단");
		
		int i = 1;
		while(i<10) {
			System.out.println(num + " X "+ i + " = " + i*num);
			i++;
		}
	}

}
