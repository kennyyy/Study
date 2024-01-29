package day06;

import java.util.Arrays;

public class ArraySort2 {

	public static void main(String[] args) {
		//버블정렬 - 두 수를 계속 비교하여 큰 값을 뒤로 보낸다.
		//바깥반복문 - 회전수
		//내부반복문 - 값의 비교를 위한 반복문
		int[] arr = {5, 23, 1, 43, 200, 100, 40};
		
		for(int i = 0; i < arr.length-1; i++) {
			for(int j = 0; j < arr.length-i-1; j++) {
				if(arr[j] > arr[j+1]) {
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				
				}
			}
		}
		System.out.println(Arrays.toString(arr));
		
		//퀵정렬 (실제 동작 알고리즘정도는 알아두자)
		int[] arr2 = {5, 23, 1, 43, 200, 100, 40};
		Arrays.sort(arr2);
		System.out.println(Arrays.toString(arr2));
		
		String[] arr3 = {"수박", "멜론", "오렌지"};
		Arrays.sort(arr3);
		System.out.println(Arrays.toString(arr3));
	}
}
