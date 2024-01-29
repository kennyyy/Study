package day04;

import java.util.Arrays;

public class MethodEx06 {

	public static void main(String[] args) {
		
		//Queue - First In First Out (FIFO - 선입선출)
		
		push(1);
		push(2);
		push(3);
		push(4);
		push(5);
		System.out.println(Arrays.toString(arr));
		
		
		for(int i = 1; i <= 5; i++) {
			pop();
			System.out.println(Arrays.toString(arr));
		}
		
	}
	
	static int[] arr = {};
	
	static void push(int data) {
		//1.배열의 크기를 +1 한 새로운 배열만듬
		int[] temp = new int[arr.length + 1];
		//2.arr배열의 요소를 복사
		for(int i = 0; i < arr.length; i++) {
			temp[i] = arr[i];
		}
		//3.마지막에 추가
		temp[temp.length - 1] = data;
		
		//4.원본배열을 temp로 변경
		arr = temp;
		temp = null; //temp는 지움
	}
	
	//배열의 맨 앞요소부터 삭제되도록 처리.
	static int pop() {
		
		if(arr.length > 0) {
			
			//1. 삭제할 데이터 백업
			int del = arr[0];
			//2. arr - 1인 사본배열 생성
			int[] temp = new int[arr.length - 1];
			//3. 배열의 1번째 요소~마지막까지 옴겨 담는다.
			for(int i = 0; i < temp.length; i++) {
				temp[i] = arr[i+1];
			}
			//4. 원본배열을 temp로 변경함
			arr = temp;
			temp = null; //temp 삭제
			
			return del; //삭제된데이터 반환
		}
		
		return 0;
	}
	
	
}
