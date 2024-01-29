package quiz01;

import java.util.Arrays;

/*Arrays.toString() 의 기능을 따라하기

1. toArray() - int[]을 매개변수로 입력받아 배열의 모형을 문자열로 리턴하는 메서드
2. toArray() - 1번과 내용은 같고, char[]을 받도록 overloading
2. toArray() - 1번과 내용은 같고, String[]을 받도록 overloading*/

public class ArrayPrint {

	
	String toArray(int[] arr) {
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
	String toArray(char[] ch) {
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
	String toArray(String[] s) {
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
	
	
	public static void main(String[] args) {
		int [] arr1 = {21,22,3,42,51};
		char [] arr2 = {'a','b','c','d','e'};
		String [] arr3 = {"one","two","three","four","five"};
		ArrayPrint ap = new ArrayPrint();
		System.out.println(ap.toArray(arr1));
		System.out.println(ap.toArray(arr2));
		System.out.println(ap.toArray(arr3));
		System.out.println(Arrays.toString(arr1));
		System.out.println(Arrays.toString(arr2));
		System.out.println(Arrays.toString(arr3));
		
		
	}
	

}
