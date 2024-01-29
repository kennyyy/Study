package day06;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class ArrayBasic {
	public static void main(String[] args) {
		//배열의 개념
		//배열 만드는 법 2가지 
		
		//int [] arr = new int[크기];
		//int[] arr = {1,2,3};
		List<Character> list = new ArrayList<Character>();
		
		list.add('c');
		
		list.get(0).compareTo('c');
		boolean a =list.contains('c');
		System.out.println(a);
		
		//입력받은 문자열을 순서대로 배열에 추가
		Scanner sc =  new Scanner(System.in);
		String[] arr = new String[5];
		
		for(int i = 0; i < arr.length; i++) {
			System.out.print("입력 > ");
			
			arr[i] = sc.next();
		}
		System.out.println(Arrays.toString(arr));
		
	}

}
