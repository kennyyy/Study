package quiz28;

public class Validation {
	/* 주민번호 검증메서드 masking(String)
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
	
	public static String masking(String ssn) throws Exception {
		
		ssn = ssn.replace("-", "");
		
		if(ssn.length() != 13 ) {
			System.out.println("주민번호는 13자리입니다");
			throw new Exception();
		} else {
			switch (ssn.charAt(6)  ) {
			case '1':
			case '3':
				System.out.println("남자 입니다");
				break;
			case '2':
			case '4':
				System.out.println("여자 입니다");
				break;
			default:
				System.out.println("잘못 입력했습니다");
				throw new Exception();
			}
		}
		
		//마스킹
		return ssn.substring(0, 6) + "-" + "*".repeat(6)";
	}
	
	
	
	
}
