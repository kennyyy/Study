package completequiz01;


import java.util.Scanner;

public class Quiz22 {

	public static void main(String[] args) {
		//백준 10818번 최대,최소 구하기
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int[] arr = new int[n];
		
	
		for(int i = 0; i < n; i++) {
			arr[i]  = sc.nextInt();	
		}
		int max = arr[0];
		int min = arr[0];
		
		for(int i = 1; i < n; i++) {
			if(max < arr[i]){
				max = arr[i];
			}
			if(min > arr[i]) {
				min = arr[i];
			}	
		}
		
		System.out.println(min + " " + max);
		
		
		
	}

}
