package day04;

import java.util.Arrays;

public class ForEx03 {

	public static void main(String[] args) {
		//임시변수를 이용한 자리바꾸기 프로그램
		/*
		int x = 10;
		int y = 100;
		int temp = 0;
		
		temp = y;
		y = x;
		x = temp;
		*/
		
		int[] arr2 = {1,2};
		
		int temp = arr2[0];
		arr2[0] = arr2[1];
		arr2[1] = temp;
		System.out.println(Arrays.toString(arr2));
		
		System.out.println("--------------------");
		
		//랜덤하게 3번 자리바꾸기
		int[] arr3 = {1,2,3,4,5,6,7,9,10};
		
		for(int i = 0; i < 3; i++) {
			int random = (int)(Math.random() * arr3.length);
			int temp2 = arr3[0];
			arr3[0] = arr3[random];
			arr3[random] = temp2;
			System.out.println("랜덤인덱스 : " + random);
			System.out.println(Arrays.toString(arr3));
		}
		
		
		}
		
}


