package completequiz01;

import java.util.Scanner;

public class Quiz06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//사칙연산 프로그램 , 잘못된 기호를 넣으면 오류 출력
		Scanner sc = new Scanner(System.in);
		System.out.println("[사칙연산을 하는 프로그램]");
		
		System.out.print("정수1 > ");
		int num1 = sc.nextInt();
		
		System.out.println("연산을 선택하세요 [+, -, *, /] > ");
		String oper = sc.next();
		
		System.out.print("정수2 > ");
		int num2 = sc.nextInt();
		
		switch (oper) {
		
		case "+":
			System.out.println("두 수의 덧셈은 : " + (num1 + num2));
			break;
		case "-":
			System.out.println("두 수의 뺄셈은 : " + (num1 - num2));
			break;
		case "*":
			System.out.println("두 수의 곱셈은 : " + (num1 * num2));
			break;
		case "/":
			System.out.println("두 수의 나눗셈은 : " + (num1 / num2));
			break;
			
		default :
			System.out.println("연산자를 잘못 입력하셨습니다.");
		}
		
		
	}

}
