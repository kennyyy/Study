package day06;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayUpdate {

	public static void main(String[] args) {
		//배열에서 값을찾고 수정.
		//어떤값을 받아서 그 값이 있다면 수정, 없다면 넘어감
		String[] arr = {"홍길동", "이순신", "피카츄", "라이츄", "꼬북이"};
		
		Scanner sc = new Scanner(System.in);
		System.out.print("수정할 값 입력 > ");
		String name = sc.next();
		
		boolean bool = false;
		
		for(int i = 0; i<arr.length; i++) {
			if(arr[i].equals(name)) {
				System.out.println(arr[i] + "님을 수정할께요!");
				System.out.print("수정 값 입력 > ");
				
				arr[i] = sc.next();
				bool = true;
				break;
			}
		}
		if(bool) {
			System.out.println("수정 완료!");
			System.out.println(Arrays.toString(arr));
		}else {
			System.out.println("찾는 값이 없음!");
		}
		
		System.out.println();
	}

}
