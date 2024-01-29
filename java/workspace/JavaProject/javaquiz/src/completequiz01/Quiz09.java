package completequiz01;

import java.util.Scanner;

public class Quiz09 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//1. 어떤 수를 입력받고, 1에서~입력받은 수까지 합계를 출력
		System.out.print("정수를 입력하세요 > ");
		int num = sc.nextInt();
		
		int i = 1;
		int sum = 0;
		while(i <= num) {
			sum+=i;
			i++;
		}
		System.out.println("1~"+ num +" 까지의 합계 : " + sum);
		
		System.out.println("------------------------");
		//2. 1~100까지 정수 중에서 짝수만 가로로 출력
		i = 1;
		System.out.print("짝수 : ");
		while(i <= 100) {
			if(i % 2 == 0) {
				System.out.print(i+ " ");
			}
			i++;
		}
		
		System.out.println("\n------------------------");
		//3. 1000의 약수의 개수 출력
		i = 1;
		int cnt = 0;
		while (i <= 1000) {
			if(1000 % i == 0) {
				cnt+=1;
			}
			i++;
		}
		System.out.println("1000의 약수의 개수는 : " + cnt);

	}

}
