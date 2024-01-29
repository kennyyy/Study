package day03;

import java.util.Scanner;

public class WhileEx02 {

	public static void main(String[] args) {
		//어떤 수가 소수 인지 판별하는 간단한방법.
		//소수 = 나누어 떨어지는 수가 1또는 자기자신인 수
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("소수인지 판별할 수 입력> ");
		int num = sc.nextInt();
		
		int i = 2;
		while(num % i != 0) { // 나머지가 0이면 false이므로 종료
							  // 나머지가 0이아니면 true 이므로 반복
			i++;
		}
		if(i == num) {
			System.out.println(num + " 소수");
		}else {
			System.out.println(num + " 소수아님");
		}
		
		//소수인지 판별하는 2번째 방법 - 2부터~자기 자신까지 나누면서 약수의 개수를 센다.
		
		i = 2;
		int cnt = 0;
		
		while(i <= num) {
			if(num % i == 0) {
				cnt+=1;
			}
			i++;
		}
		
		if(cnt == 1) {
			System.out.println(num + " 소수");
		}else {
			System.out.println(num + " 소수아님");
		}
	}

}
