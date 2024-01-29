package quiz01;

public class Quiz18 {

	public static void main(String[] args) {
		
		//배열 요소들중 짝수인 값들의 합
		int[] arr = {54, 32, 3, 5, 7, 14, 20};
		
		int sum = 0;
		
		int i = 0;
		while(i < arr.length) {
			
			if(arr[i] % 2 == 0) {
				sum += arr[i];
			}
			i++;
		}
		
		System.out.println("결과:" + sum);
		
		
		
		
		
	}
}
