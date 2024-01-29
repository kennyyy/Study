package quiz23;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexQuiz02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "123123-45644 GS25(치킨도시락) 4,400원";
		String str2 = "123123-3453454 GS25(마늘햄쌈) 5,000원";
		String str3 = "123456-3453 GS(갓혜자도시락) 6,000";
		
		//상품번호, GS25, (상품명), 가격 분리해서 출력
		
		//1줄에대해서 패턴 4개 나오고, 문자열을 각각 처리하는 반복 (중첩반복)
		
		String pattern = "[0-9]{1,}-[0-9]{1,}";
		String pattern2 = "[A-Z]{2}[0-9]*"; 
		String pattern3 = "\\([가-힣]*\\)";
		String pattern4 = "([0-9]*,)+[0-9]*원?";
		
		String[] strAll = {str, str2, str3};
		String[] patternAll = { pattern, pattern2, pattern3, pattern4};
		
		
		
	
		for(String s : strAll) {
			
			for(String pat : patternAll) {
				Matcher m = Pattern.compile(pat).matcher(s);
				if(m.find()) {
					System.out.println(m.group());
				}
			}
		}
	

	}

}
