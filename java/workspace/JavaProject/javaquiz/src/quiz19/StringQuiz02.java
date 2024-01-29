package quiz19;

public class StringQuiz02 {
	public static void main(String[] args) {
		/* 주민번호 검증메서드 masking(String) : String
		 * 마스킹 메서드는 주민번호값이 매개변수로 들어올 때
		 * 950101-*******로 마스킹 처리하여 리턴하는 static메서드를 만들어주세요.
		 * 
		 * 1. 문제의 간소화를 위해 생년월일은 정상범위라고 가정합니다.
		 * 2. 13자리가 아니거나, 남,여 가 아니라면 throws처리합니다.
		 * 3. 주민번호는 - 를 포함해서 받을 수 있습니다.
		 * 4. 남, 여에 대한 정보를 출력해줍니다.
		 *  
		 * masking메서드를 만들어주세요 
		 * 검증데이터 950101-1000000 -> 남자
		 * 검증데이터 9501012000000 -> 여자
		 * 검증데이터 950101-5000000 -> 예외
		 * 검증데이터 9501015000000 -> 예외
		 * 검증데이터 950101511111 -> 예외
		 */
		try {
			String str1 = StringQuiz02.masking("950101-1000000");
			System.out.println(str1);
			
			String str2 = StringQuiz02.masking("9501012000000");
			System.out.println(str2);
			
			String str3 = StringQuiz02.masking("950101-5000000");
			System.out.println(str3);
			
			String str4 = StringQuiz02.masking("9501015000000");
			System.out.println(str4);
			
			String str5 = StringQuiz02.masking("950101511111");
			System.out.println(str5);
			
			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static String masking(String ssn) throws Exception {
		String frontStr = "";
		String backStr = "";
		
		String strTemp = "";
		String strNew = "";
		
		if(ssn.contains("-")) {
			frontStr = ssn.substring(0, 6);
			backStr = ssn.substring(7, ssn.length()-1);
			strTemp += frontStr + backStr;
			
		}else {
			frontStr = ssn.substring(0, 6);
			backStr = ssn.substring(6, ssn.length()-1);
			strTemp += frontStr + backStr;
		}
		
		if(strTemp.length()!=13 && strTemp.charAt(6) != '1' && strTemp.charAt(6) != '2' ) {
			throw new Exception("13자리가 아니거나, 남,여 가 아닙니다");
		}
		
		if(strTemp.charAt(6) == '1') {
			System.out.println("남자");
		}else if(strTemp.charAt(6) == '2') {
			System.out.println("여자");
		}
		
		
		strNew += frontStr;
		strNew += "-*******";
		
		return strNew;
	}
}
