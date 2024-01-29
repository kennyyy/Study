package 검색알고리즘;

import java.util.Scanner;

/*
 * 순차 검색 알고리즘
 */

public class SequentailEx01 {
	public static void main(String[] args) {
		//배열 => 자료구조 준비
		int[] data = {30,10,50,40,20,70,90,25,120,150};
		//int n = 10;	//검색 대상 데이터 갯수
		int i, find;
		
		//입력
		System.out.print("찾고자 하는 값은? ");
		Scanner scan = new Scanner(System.in);
		find = scan.nextInt();
		
		//처리 => 순차 검색 알고리즘 적용
		for(i=0; i<data.length; i++) {
			if(find == data[i]) {
				System.out.println("찾고자 하는 값은 " + data[i] + "입니다.");
				break;	//[주의]
			}
		}
		//배열에 없는 데이터를 요구했은 때 해결 방법
		if(i == data.length) {
			System.out.println(find + "을 찾을 수 없습니다.");
		}		
	}
}







