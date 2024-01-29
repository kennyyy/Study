package quiz19;

import java.util.Arrays;
import java.util.Scanner;

public class StringQuiz01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		/*
		 * 1. 스캐너를 통해서 id를 nextLine으로 입력받습니다.
		 * 2. 아이디는 공백을 포함해서 받을 수 있습니다.
		 * 
		 * 단, 공백을 제거한 아이디길이가 5글자 미만이면 다시 입력받으세요.
		 *    5글자 이상이면 "id등록" 을 출력하고 종료하면 됩니다.
		 */
		
		
		while(true) {
			String str = sc.nextLine();
			String[] strArr = str.split(" ");
			String temp = "";
			
			for(String s : strArr) {
				temp += s;
				
			}
			System.out.println(temp);
			if(temp.length() < 5) {
				continue;
			}else {
				System.out.println("id 동록");
				break;
			}
		}


	}

}
