package quiz39;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexQuiz01 {

	public static void main(String[] args) {
		
		/*
		 * 가격형식만 찾아서 순서대로 출력해보세요 
		 * ex)~~~원
		 */
		
		// *는 0회 이상반복: 있어도 되고 없어도 되는경우
		
		String str = "헠4,500원 헿~ 1,200원엏? 6000원윀 120000원";
		
		String pattern = "[0-9]+,*[0-9]+원";
		//String pattern = "\\d+,*\\d+원";
		
		Matcher m = Pattern.compile(pattern).matcher(str);
		
		while(m.find()) {
			System.out.println(m.group());
		}
		
		
		
		
		
		
		
	
	}
}
