package completequiz01;

import java.util.Scanner;

public class Quiz20 {

	public static void main(String[] args) {
		//(1~100범위)랜덤한 더하기 문제를 내고 정답맞추기
		//0을 입력하면 정답, 오답 수 출력하고 종료 
		Scanner sc = new Scanner(System.in);
		
		int s_cnt = 0;
		int f_cnt = 0;
		
		while(true) {
			int ran1 = (int)(Math.random()*100) + 1;
			int ran2 = (int)(Math.random()*100) + 1;
			
			System.out.println("--------------");
			System.out.println(ran1 + " + " + ran2 + " =  ?");
			System.out.println("[문제를 그만 푸시려면 0을 입력하세요.]");
			System.out.print("> ");
			int num = sc.nextInt();
			
			if(ran1 + ran2 == num) {
				System.out.println("정답입니다.");
				s_cnt++;
			}else if(num == 0) {
				break;
			}
			else {
				System.out.println("를렸습니다.");
				f_cnt++;
			}
		}
		System.out.println("프로그램 정상 종료");
		System.out.println("정답 : " + s_cnt);
		System.out.println("오답 : " + f_cnt);
	}

}
