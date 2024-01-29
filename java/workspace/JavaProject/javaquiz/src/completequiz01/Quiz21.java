package completequiz01;


public class Quiz21 {

	public static void main(String[] args) {
		//아래 값들 중 제일 큰 값을 출력해주세요.
		int[] arr= {34, 65, 12, 34, 56, 34, 100, 54, 21};
		

		int max = arr[0];
		
		for(int i = 1; i<arr.length; i++) {
			if(arr[i] > max) {
				max = arr[i];
			}
		}
		System.out.println("가장 큰 값은 : "+ max);
		
		
		
		
	}

}
