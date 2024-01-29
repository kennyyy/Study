package quiz28;

import java.util.Scanner;

public class StringQuiz02 {

	public static void main(String[] args) {
		
		try {
//			String result = Validation.masking("950101-1000000");
//			String result = Validation.masking("9501012000000");
//			String result = Validation.masking("950101-5000000");
//			String result = Validation.masking("9501015000000");
			String result = Validation.masking("950101511111");
			System.out.println(result);
			
		} catch (Exception e) {
			System.out.println("주민번호 형식이 아닙니다");
		}
		

//		Scanner scan = new Scanner(System.in);
//			
//		a:while(true) {
//			
//			System.out.print("주민번호 13자리를 입력하세요>");	
//			String ssn = scan.nextLine();
//			
//			ssn = ssn.replace("-", "");
//			
//			if(ssn.length() != 13) {
//				System.out.println("주민번호는 13자리입니다");
//			} else {
//				
//				switch (ssn.charAt(6)  ) {
//				case '1':
//				case '3':
//					System.out.println("남자 입니다");
//					break a;
//				case '2':
//				case '4':
//					System.out.println("여자 입니다");
//					break a;
//				default:
//					System.out.println("잘못 입력했습니다");
//					continue a;
//				}
//			}
//			
//			
//		}
//		
//		scan.close();
		
		
		
		
	}
}
