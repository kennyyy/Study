package completequiz01;

import java.util.Scanner;

public class MethodQuiz02 {

	public static void main(String[] args) {
		//두 수를 입력받아서 두 수의 합을 구하세요. =
		//print() 
		System.out.println("두 정수를 입력하세요!");
		
		//input() 메서드로 변경 (2번필요 하겠지요?) - 메서드 내부에서 입력을 받아서 리턴하는 메서드로 변경
		Scanner sc = new Scanner(System.in);
		System.out.println("> ");
		int num1 = sc.nextInt();
		System.out.println("> ");
		int num2 = sc.nextInt();
		
		//add() - 두 수의 합을 더해서 결과를 리턴
		int result = num1 + num2;
		
		//result() - 결과를 받아서 출력
		System.out.println("두 수의 합 : " + result);
		
		//위에 문장들을 각각 메서드로 구조화해서 똑같은 결과를 출력해보시오.
		
		print();
		num1 = input();
		num2 = input();
		result = add(num1, num2);
		result(result);
	}
	
	static void print() {
		System.out.println("두 정수를 입력하세요!");
	}
	
	static int input() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("> ");
		int num = sc.nextInt();
		
		return num;
	}
	static int add(int a, int b) {
		return a+b;
	}
	static void result(int result) {
		System.out.println("두 수의 합 : " + result);
	}

}
