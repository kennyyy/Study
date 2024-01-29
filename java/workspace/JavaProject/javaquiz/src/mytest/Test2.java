package mytest;

public class Test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n = 5;
		
		for (int i = 0 ; i < n; i++) {
			for(int j = 0; j < n-i-1; j++) {
				System.out.print(" ");
			}
			for(int k = 0; k < 2*i+1; k++) {
				System.out.print("*");
			}
			System.out.print("\n");
		}
		
		
		int a = 1;
		
		while ( a % 2 != 0) {
			a = (int)(Math.random()* 100);
			System.out.println(a);
		}
		System.out.println("홀수 당첨 ");
	}

}

