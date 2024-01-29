package day06;

import java.util.Arrays;

public class ArrayDelete {

	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5,6,7,8,9,10};
		//배열은 값의 삭제라는 개념이 없습니다
		//마치 삭제되는 것처럼 처리합니다.
		int index = 5; //삭제할 인덱스(가정)
		//1. 삭제할 위치 다음값부터~ 마지막직전까지 배열을 당깁니다.
		//2. 새로운 배열에
		for(int i = index ; i < arr.length-1; i++) {
				arr[i] = arr[i+1];
			
		}
		System.out.println(Arrays.toString(arr));
		
		int[] newArr = new int[arr.length-1];
		
		for(int i = 0; i < newArr.length; i++) {
			newArr[i] = arr[i];
		}
		
		System.out.println(Arrays.toString(newArr));
	}	

}
