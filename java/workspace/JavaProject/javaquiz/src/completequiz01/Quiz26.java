package completequiz01;

import java.util.Scanner;

public class Quiz26 {

	public static void main(String[] args) {
		//백준 2566번 2차원 배열의 값 중 최댓값을 구하고, 최대값의 index를 구해 출력해보자. 
		Scanner sc = new Scanner(System.in);
		
		int[][] arr = new int[9][9];
				
		int max = -1;
		int n1 = 0;
		int n2 = 0;
		
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				int n = sc.nextInt();
				if(n>=0 && n<100) {
					if(max < n) {
						max = n;
						n1 = i+1;
						n2 = j+1;
					}
					arr[i][j] = n;	
				}
					
				}
							
			}
				
		System.out.println(max);
		System.out.print(n1 + " " + n2);

	}

}
