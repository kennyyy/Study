package day04;

public class ForEx01 {

	public static void main(String[] args) {
		int sum = 0;
		for(int i = 1; i<=10; i++) {
			sum+=i;
		}
		
		for(int i =10; i>=1 ; i-- ) {
			System.out.println(i);
		}
		
		System.out.println("합계 : " + sum);
	}

}
