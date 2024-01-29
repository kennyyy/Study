package day06;

import java.util.Arrays;

public class ArrayMatrix {

	public static void main(String[] args) {
		//2차원 배열 - 배열안에 배열이 들어간다.
		// { {1,2,3,4}, {4,5,6,7}, {8,9,10,11} }
		//{	   0열 1열 2열  4열
		//	0행 {1, 2, 3,  4},
		//	1행 {4, 5, 6,  7}, 
		//	2행 {8, 9, 10, 11} 
		//}

		//2차원 배열을 만드는 방법1
		int[][] arr1 = { {1,2,3,4}, {5,6,7,8}, {9,10,11,12} };
		
		int[] arr2 = {1,2,3}; 
		int[] arr3 = {4,5,6}; 
		int[] arr4 = {7,8,9};
		
		//위 방법과 같은 의미
		int[][] arr5 = { arr2, arr3, arr4 };
		
		//인덱스의 접근
		System.out.println(arr1); //2차원 배열의 주소값
		System.out.println(arr1[0]); //1차원 배열의 주소값 
		System.out.println(arr1[1]); //1차원 배열의 주소값 
		System.out.println(arr1[2]); //1차원 배열의 주소값 
		
		//2차원 배열에 접근
		System.out.println(arr1[0][0]); //0행 0열
		System.out.println(arr1[0][1]); //0행 1열
		System.out.println(arr1[0][2]); //0행 2열
		
		//0행 0열 값 변경
		arr1[0][0] = 100; 
		System.out.println(arr1[0][0]);
		
		//2차원 배열에 순차적 접근
		//행
		for(int i = 0; i < arr1.length; i++) {
			//열
			for(int j = 0; j < arr1[i].length; j++) {
				System.out.print(arr1[i][j] + " ");
				
			}
		}
		System.out.println();
		
		//2차원 배열을 만드는 방법2
		int[][] arr = new int[3][4];//[행][열]
		
		//arr 2차원 배열에 1~12까지 값을 순서대로 저장
		int cnt = 0;
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				arr[i][j] = cnt++;
				System.out.print(arr[i][j] + " ");	
			}
		}
		System.out.println();
		
		//2차원의 배열의 값을 문자열로 출력
		System.out.println(Arrays.deepToString(arr));
	
	}
}
