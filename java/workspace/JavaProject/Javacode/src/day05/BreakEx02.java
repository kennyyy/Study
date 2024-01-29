package day05;

import java.util.Scanner;

public class BreakEx02 {
	public static void main(String[] args) {
		//정답맞추기
		Scanner sc = new Scanner(System.in);
		int count = 0;//정답횟수
		
		while(true){
			System.out.println("피카츄가 양파를 까면서 하는 말은?");
			System.out.print("정답을 입력하세요 > ");
			String answer = sc.next();
			System.out.print("\n");
			count++;
			//문자열에서 비교연산자는 == <<< 문자열의 주소값을 비교하기때문에 
			//equals()를 사용해서 문자 하나하나를 비교해주는 방식을 사용해줘야한다. 
			if(answer.equals("언제언제까지나") ) {
				
				System.out.println("정답입니다!");
				break;
			}else {
				System.out.println("틀렸습니다.");
			}
		}
		System.out.println("정답횟수는 : " + count + " 입니다.");
		
	}

}
