package day04;

public class WhileEx04 {
	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5,6,7,8,9,10};//배열의 길이는 항상 마지막인덱스보다 1큼
		
		//시작은 0에서 출발하고, 끝은 9
		int sum = 0;
		int i = 0;
		while (i< arr.length) {
			System.out.println(arr[i]);
			sum += arr[i];
			i++;
		}
		System.out.println("배열 요소의 합 : " + sum);
	}

}
