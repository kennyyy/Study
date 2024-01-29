package completequiz01;

import java.util.Scanner;

public class Quiz18 {

	public static void main(String[] args) {
		//중첩반복문 - 회전수가 변해야 합니다.
		
		//num를 입력받았을 때, 1~ num까지 수중에서 소수의 합계 출력
		//소수- 약수가 1과 자기자신인수
		
		//num = 10
		// 2+ 3 + 5 + 17
		
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 입력 > ");
		
		int num = sc.nextInt();
		int sum = 0;
		int cnt = 0;
		
		con:for(int i = 2; i < num; i++) {
			cnt=0;
			for(int j = 2; j < i; j++) {
				if(i % j == 0) {
					cnt+=1;
					continue con;//약수가 하나라도 있으면 이미 소수가 아니라는 뜻, 건너뛰자
					
				}
			}
			
			if(cnt == 0) {
				System.out.println("소수 : " + i);
				sum+=i;
			}
			
		}
		System.out.println("n까지 소수의 합 : " + sum);
	}

}
