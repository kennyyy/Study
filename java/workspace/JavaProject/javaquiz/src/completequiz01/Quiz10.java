package completequiz01;

import java.util.Scanner;

public class Quiz10 {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수를 입력해주세요 > ");
		int num = sc.nextInt();
		
		int i = 1;
		int sum = 0;
		
		while(i != num + 1) {
			if(num % i == 0) {
				sum += i;
			}
			i++;
		}
		System.out.println("약수의 합 : " + sum);

	}

}
