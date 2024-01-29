package completequiz01;

import java.util.Arrays;
import java.util.Scanner;

public class Quiz11 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("수를 입력하세요> ");
		int num = sc.nextInt();
		int[] arr = new int[num];
		
		int i = 0;
		while (i<arr.length) {
			arr[i]= i+1;
			i++;
		}
		
		System.out.println(Arrays.toString(arr));
		

	}

}
