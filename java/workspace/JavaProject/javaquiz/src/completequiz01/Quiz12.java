package completequiz01;

public class Quiz12 {

	public static void main(String[] args) {
		int[] arr = {1000, 500, 100, 50, 10};
		
		int money = 17790;
		
		int i = 0;
		
		int sum = 0;
		while ( i< arr.length) {
			sum += money/arr[i];
			System.out.println(arr[i] + "원짜리 : "+ money/arr[i] +"개" );
			money -= money/arr[i]*arr[i];
			
			i++;
		}
		System.out.println("최소 동전의 개수 : " + sum);
	}

}