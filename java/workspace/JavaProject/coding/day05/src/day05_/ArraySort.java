package day05_;

import java.util.Arrays;

public class ArraySort {

	public static void main(String[] args) {
		
		//배열정렬 - 정렬은 대략 6개
		//선택정렬 
		int[] arr = {5, 23, 1, 43, 200, 100, 40};
		
		//1, 23, 5, 43, 200, 100, 40 - 1회전후
		//1, 5, 23, 43, 200, 100, 40 - 2회전후
		//1, 5, 23, 43, 200, 100, 40 - 3회전후
		//1, 5, 23, 40, 200, 100, 43 - 4회전후
		//1, 5, 23, 40, 42, 200, 100 - 5회전후
		//1, 5, 23, 40, 42, 100, 200 - 6회전후
		
		//바깥반복문은 회전수
		//안쪽반복문은 비교할값
		for(int i = 0; i < arr.length-1; i++) { //0~5까지
			for(int j = i+1; j < arr.length; j++) {//i+1~끝
				if(arr[i] > arr[j] ) { //비교대상이 작다면, swap
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		
		System.out.println(Arrays.toString(arr));
		
		
		
		
		
	}
}
