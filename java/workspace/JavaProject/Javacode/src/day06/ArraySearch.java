package day06;

import java.util.Scanner;

public class ArraySearch {

	public static void main(String[] args) {
		//탐색(순회)
		int[] arr= {54, 23, 12, 76, 56, 45, 1, 2, 3};
		
		//입력받은 값이 배별에 있는가?
		Scanner sc = new Scanner(System.in);
		System.out.print("찾을값 > ");
		int search = sc.nextInt();
		
		boolean bool = false; 
		
		for (int i = 0; i < arr.length; i++) {
			if(arr[i] == search) {
				System.out.println(search+ "는  인덱스 " + i + "번째에 있습니다.");
				bool = true; //bool이 true라는 것은 if문을 실행했다는 의미
				break;
			}
		}
		if(!bool) {
			System.out.println("찾는 값은 없습니다.");
		}	
	}

}
