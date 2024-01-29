package completequiz01;

import java.util.Scanner;

public class Quiz02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("바구니 크기 입력> ");
		int size = sc.nextInt();
		
		System.out.print("사과의 개수 입력> ");
		int apple = sc.nextInt();
		
//		int basket = apple/size;
//		if(!( apple % size == 0)) 
//			basket += 1;	
		
		int baket =  apple % size == 0 ? apple / size : apple / size + 1;
		
		System.out.println("사과 개수 : " + apple);
		System.out.println("바구니는 " + baket + "개 필요해요");
	}

}
