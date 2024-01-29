package day05;

public class ContinueEx01 {
	public static void main(String[] args) {
		//continue
		for(int i = 1 ; i <= 10; i++) {
			if(i == 5) {
				continue;
			}
			System.out.print(i + " ");
		}
		
		System.out.println("\n------------");
		//Labeled Loop 
		escape:for(int i = 1; i <= 10; i++) {
			for(int j= 1; j <= 10; j++) {
				for(int k=1; k<=10; k++) {
					System.out.println(i + " - " + j + " -" + k);
					if(k == 3) {
						continue escape;
					}
				}
			}
			
		}

	}

}
