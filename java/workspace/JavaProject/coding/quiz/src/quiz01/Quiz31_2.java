package quiz;

import java.util.Arrays;

public class Test {

	public static void main(String[] args) {
		//버블정렬		

		int[] arr = {5,23, 1, 43, 100, 200, 40 };
		
		//맥스 사이즈만큼 회전(회전수를 의미)
		for(int i = arr.length-1; i > 0; i--) { //시작은 배열길이 -1에서 감소조건
			
			for(int j = 0; j < i; j++) { //검사를 위한 조건
				
				System.out.println(i + "-" + j);
				if(arr[j] < arr[j+1]) { //해당인덱스 바로 다음값이 크다면
					
					int temp = arr[j+1];
					arr[j+1] = arr[j];
					arr[j] = temp;
				}
					
			}
		}
		System.out.println(Arrays.toString(arr));
		
		
	}
}
