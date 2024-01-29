package completequiz01;

import java.util.Arrays;
import java.util.Scanner;

public class Quiz25 {

	public static void main(String[] args) {
		//먹고 싶은 음식을 입력하고 배열을 크기를 조정하여 출력하시오
		//그만을 입력하면 입력한 음식들을 출력
		//배열의 size는 조정하지 마세요
		String[] arr = new String[100]; //딱 100개만 수용
		int index = 0;//위치값
		
		System.out.println("먹고싶은 음식을 선택하세요");
		System.out.println("입력을 중단하려면 [그만]을 입력하세요");
		
		Scanner sc = new Scanner(System.in);
		
		for(int i = 0 ; i < arr.length; i++) {
			System.out.print(">");
			String food =sc.next();
			if(food.equals("그만")) {
				System.out.println("입력종료");
				index = i;
				break;
			}
			arr[index++] = food;
		}
		
		System.out.println("----- 입력 받은 메뉴 -----");
		for(int i = 0; i<index; i++) {
			System.out.print(arr[i] + " ");
		}
		
	}

}
