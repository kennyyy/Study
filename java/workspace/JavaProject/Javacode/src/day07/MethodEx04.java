package day07;

import java.util.Arrays;

public class MethodEx04 {

	public static void main(String[] args) {
		//배열을 매개변수로 전달? 전달하는 배열유형과 매개변수의 유형을 꼭 맞춰야 한다.
		String[] arr = {"월", "화", "수"};
		String result = func01(arr);
		System.out.println("[func01] : " + result);
		
		//배열을 반환받는다? 꼭 변수유형과 리턴유형을 맞춰야 한다.
		int[] result2 = func02(); 
		System.out.println("[func02] : " + Arrays.toString(result2));
		
		char[] result3 = {'피', '카', '츄'};
		System.out.println("[method6] : " + method6(result3));
		
		int[] result4 = {1,2,3,4,5,6,7,8,9,10};
		System.out.println("[method7] : " + method7(result4));
		
		String[] result5 = method8("피카츄", "라이츄");
		System.out.println("[method8] : " + Arrays.toString(result5));
		
	}
	//배열을 매개변수로 받는 메서드.
	static String func01(String[] arr) {
		String str = "";
		for(int i = 0; i<arr.length; i++) {
			str += arr[i] + " ";
		}
		return str;
	}
	//배열을 반환하는 메서드
	static int[] func02() {
		int[] arr = {1, 2, 3};
		
		return arr;
	}
	//char배열의 요소를 문자열로 모두 붙여서 리턴받는 메서드
	static String method6(char[] ch) {
		String str = "";
		for(int i = 0; i < ch.length; i++) {
			str += "" + ch[i];
		}
		return str;
	}
	//배열의 요소의 합을 리턴받는 메서드
	static int method7(int[] num) {
		int sum = 0;
		for(int i = 0; i < num.length; i++) {
			sum += num[i];
		}
		return sum;
	}
	//매개 변수를 배열에 저장하여 배열 리턴받는 메서드
	static String[] method8(String s1, String s2) {
		String[] str = {s1, s2};
		return str;
	}
	
}
