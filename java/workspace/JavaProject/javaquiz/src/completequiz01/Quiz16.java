package completequiz01;

public class Quiz16 {
	public static void main(String[] args) {
		//중첩반복문을 이용하여 2~9단을 출력해보자
		 for(int i = 2; i <= 9; i++) {
			 System.out.println("구구단 : " + i +"단"); 
			 for(int j = 1; j <= 9; j++) { System.out.println(i + " X " + j + " = " + i*j);
			 }
			 System.out.println("----------------"); 
		}
		 
		//가로로쓰는 구구단을 출력해보자
		for(int i = 1; i <= 9; i+=3) {
			for(int j = 1; j <=9; j++) {
			System.out.print(i + " X " + j + " = " + i*j +"\t");	
			System.out.print(i+1 + " X " + j + " = " + (i+1)*j +"\t");	
			System.out.print(i+2 + " X " + j + " = " + (i+2)*j +"\t");
			System.out.println();
			}
			System.out.println();
	
		}
	}

}
