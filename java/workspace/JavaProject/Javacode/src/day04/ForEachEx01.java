package day04;

public class ForEachEx01 {

	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5};
		//Enhanced for loop
		//(변수 : 배열명)
		for(int a : arr) {
			System.out.print(a + " ");
		}
		System.out.println();
		
		
		//일반for
		for(int a = 0; a < arr.length; a++) {
			System.out.print(arr[a] + " ");
		}
		System.out.println();
		
		String[] arr2 = {"월", "화", "수", "목", "금", "금", "금"};
		
		for(String a : arr2) {
			System.out.print(a + "요일 ");
		}
		System.out.println();
		
		
		//score의 합계, 평균은 소수점까지 향샹된 포문으로 구하시오
		int[] score = {33, 44, 52, 17, 34, 54, 90};
		int sum = 0;
		double avg = 0.0;
		
		for(int i : score) {
			sum+=i;
		}
		//소수점 3째자리 수까지 구하기
		avg = ((double)sum/score.length);
		avg= (double)((int)(avg * 100))/100;
		
		System.out.println("score 평균: " + avg);
	}

}
