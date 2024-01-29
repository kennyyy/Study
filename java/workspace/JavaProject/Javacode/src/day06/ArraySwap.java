package day06;

import java.util.Arrays;
import java.util.Scanner;

public class ArraySwap {

	public static void main(String[] args) {
		//배열의 값을 서로 바꾸는 작업
		int [] arr = {1, 2, 3, 4,5, 6, 7, 8, 9, 10};

		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.println("서로 바꿀 두개의 인덱스를 입력해주세요(탈출 = -1 입력)");
			int idx1 = sc.nextInt();
			if(idx1 ==-1) {
				break;
			}
			int idx2 = sc.nextInt();
			
			int temp = arr[idx2];
			arr[idx2] = arr[idx1];
			arr[idx1] = temp;
			
			System.out.println(Arrays.toString(arr));
			System.out.println();
		}
	}
}
