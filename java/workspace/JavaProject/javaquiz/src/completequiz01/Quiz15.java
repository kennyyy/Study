package completequiz01;

import java.util.Arrays;

public class Quiz15 {
	public static void main(String[] args) {
		//절대 중복되지 않는 값을 가지고 있는 길이가 3인 배열만들기
		//1.랜덤수 2개를 생성해서, arr배열을 랜덤하게 10번 섞어줍니다.
		//2. 0~2번째 값을 가지는 새로운 배열로 옮겨담아보세요.
		int[] arr = {1,2,3,4,5,6,7,9};
		int[] arr2 = new int[3];

		for(int i = 0; i < 10; i++) {
			int ran1 = (int)(Math.random() * arr.length);
			int ran2 = (int)(Math.random() * arr.length);
			int temp = arr[ran1];
			arr[ran1] = arr[ran2];
			arr[ran2] = temp;
			System.out.println("랜덤 값 섞기 " + (i+1) + "번째 " + Arrays.toString(arr));
		}
		
		for(int i = 0; i < arr2.length; i++) {
			arr2[i] = arr[i]; 
		}
		System.out.println("0~2번째 인덱스 값 : "+Arrays.toString(arr2));
		
	}

}
