package quiz14;

import java.util.Arrays;

/*Arrays.toString() 의 기능을 따라하기

1. toArray() - int[]을 매개변수로 입력받아 배열의 모형을 문자열로 리턴하는 메서드
2. toArray() - 1번과 내용은 같고, char[]을 받도록 overloading
2. toArray() - 1번과 내용은 같고, String[]을 받도록 overloading*/

public class ArrayPrint {
	//1.생성자에 접근제어자를 붙여서, 객체 생성이 불가능하도록 처리
	//2. 메서드 호출시에는 staitc키워드를 붙여서 사용하도록 변경
	private ArrayPrint() {
		
	}
	
	public static String toArray(int[] arr) {
		String str = "[";
		
		for(int i = 0; i < arr.length; i++) {
			if(i == arr.length-1) {
				str += arr[i];
			}else {
				str += arr[i]+ ", ";
			}
			
		}

		return str + "]";
	}
	public static String toArray(char[] ch) {
		String str = "[";
		for(int i = 0; i < ch.length; i++) {
			if(i == ch.length-1) {
				str += "" + ch[i];
			}else {
				str += ch[i]+ ", ";
			}
			
		}
		return str + "]";
	}
	public static String toArray(String[] s) {
		String str = "[";
		for(int i = 0; i < s.length; i++) {
			if(i == s.length-1) {
				str += s[i];
			}else {
				str += s[i]+ ", ";
			}
	
		}
		return str + "]";
	}
	
	

	

}
