package day03;

import java.util.Scanner;

public class SwitchEx02 {

	public static void main(String[] args) {
		//switch 문장을 else if 문장과 90% 유사하다.
		Scanner sc = new Scanner(System.in);
		
		System.out.print("점수입력 > ");
		int point = sc.nextInt();
		
		String grade;
		
		switch (point/10) {//변수의 연산식 가능

		case 9: //99~90
			if(point >= 95) {
				grade = "A++학점";
			}else {
				grade = "A학점";
			}
			break;
		case 8:
			grade = "B학점";
			break;
		case 7:
			grade = "C학점";
			break;
		case 6:
			grade = "D학점";
			break;

		default:
			grade = "F학점";
			break;
		}
		
		System.out.println("당신의 학점은 : " + grade);
	}

}
