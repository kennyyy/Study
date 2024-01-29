package mytest;


import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
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

/*
 * Scanner sc = new Scanner(System.in);
 * 
 * int price = sc.nextInt(); int num = sc.nextInt();
 * 
 * int sum = 0; int i = 0; while(i < num) { int n1 = sc.nextInt(); int n2 =
 * sc.nextInt(); sum += n1*n2; i++; }
 * 
 * if( sum == price) { System.out.println("Yes"); }else {
 * System.out.println("No"); }
 * 
 * }
 */
