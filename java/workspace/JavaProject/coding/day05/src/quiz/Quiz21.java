package quiz01;

import java.util.Arrays;

public class Quiz21 {

	public static void main(String[] args) {
		
		/*
		 * 1. 1~9까지 숫자중 절대 중복되지 않는 숫자 3개를 추출.
		 * 	  Math.random() 을 사용하여,
		 * 	  arr를 랜덤하게 10번 섞어줍니다.
		 * 	  0~2번째 값을 새로운 배열로 옴겨 담아보세요.
		 */
		
		int[] arr = {1,2,3,4,5,6,7,8,9 };
		
		for(int i = 1; i <= 10; i++) {
			
			int a = (int)(Math.random() * 9); //0~8
			int b = (int)(Math.random() * 9); //0~8
			
			int temp = arr[a];
			arr[a] = arr[b];
			arr[b] = temp;
		}
		
		int[] newArr = new int[3];
		for(int i = 0; i < newArr.length; i++ ) {
			newArr[i] = arr[i];
		}
		
		System.out.println( Arrays.toString(newArr));
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
