package quiz23;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexQuiz01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "헠4,500원 크크크 1,200원?? 6000원엨 120000원";
		
		String pattern = "\\d{1,10}(,\\d{3})*";
		
		
		Matcher m = Pattern.compile(pattern).matcher(str);
		
		while(m.find()) {

			System.out.println(m.group() );
	
		}

	}

}
