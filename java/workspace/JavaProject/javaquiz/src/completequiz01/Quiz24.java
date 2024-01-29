package completequiz01;

import java.util.Arrays;

public class Quiz24 {

	public static void main(String[] args) {
		//배열의 길이는 고정이라서 끝에 추가하는 작업이 불가.
		//배열에 끝에 값을 추가하는 프로그램을 만들어보자.
		int[] arr = {100, 200, 300, 400, 500};
		
		int value = 600;
		//1.새로운 배열+1 크기의 배열을 만든다.
		//2.기존 배열의 값을 옮겨 담는다.
		//3.마지막에 value를 추가한다.
		
		int[] newArr = new int[arr.length+1];
		
		for(int i = 0; i < newArr.length; i++) {
			if(i == newArr.length-1) {
				newArr[newArr.length-1] = value;
				break;
			}
			newArr[i] = arr[i];
		}
		
		System.out.println(Arrays.toString(newArr));
		
		//배옆 맨 앞에 값 추가하기
		int[] arr2 = {10, 20, 30, 40, 50, 0};
		
		value = 60;
		for(int i = arr2.length-1; i >= 0; i--) {
			if(i == 0) {
				arr2[i] = value;
				break;
			}
			arr2[i]= arr2[i-1];
		}
		System.out.println(Arrays.toString(arr2));

	}

}
