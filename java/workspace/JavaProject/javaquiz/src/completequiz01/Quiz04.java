package completequiz01;

import java.util.Scanner;

public class Quiz04 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("> ");
		int a = sc.nextInt();
		
		System.out.print("> ");
		int b = sc.nextInt();
		
		if(a < b) {
			System.out.println(b + "가 더 큰 수 입니다.");
		}else if( a > b) {
			System.out.println(a + "가 더 큰 수 입니다.");
		}else {
			System.out.println("같은 수 입니다.");
		}
	}

}
