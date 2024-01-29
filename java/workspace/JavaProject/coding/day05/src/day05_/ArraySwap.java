package day05_;

import java.util.Arrays;
import java.util.Scanner;

public class ArraySwap {

	public static void main(String[] args) {
		/*
		int x = 5;
		int y = 10;
		int temp = 0;
		
		temp = x;
		x = y;
		y = temp;
		
		System.out.println(x);
		System.out.println(y);
		*/
		
		//두 수를 입력받아서, 두 수의 위치번째를 변경
		int[] arr = {1,2,3,4,5,6,7,8,9,10};
		
		Scanner scan = new Scanner(System.in);
		
		int a = scan.nextInt(); //0~9
		int b = scan.nextInt(); //0~9
		
		int temp = 0;
		temp = arr[a];
		arr[a] = arr[b];
		arr[b] = temp;
		
		System.out.println(Arrays.toString(arr));
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
