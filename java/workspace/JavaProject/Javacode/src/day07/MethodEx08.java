package day07;

import java.util.Arrays;

public class MethodEx08 {
	static int[] arr = {};
	public static void main(String[] args) {
		//Queue - FIFO (First In First Out)

		push(10);
		push(20);
		push(30);
		
		System.out.println("push 후 arr[] : " + Arrays.toString(arr));

		for(int i = 0; i < 3; i++) {
			pop();
			System.out.println(Arrays.toString(arr));
		}
	}
	

	//추가
	static void push(int data) {
		//1. 배열의 크기를 +1 시킴
		int[] temp = new int[arr.length + 1];
		//2. 배열의 요소를 복사
		for(int i = 0; i < arr.length; i++) {
			temp[i] = arr[i];
		}
		//3. 마지막에 추가
		temp[temp.length - 1] = data;

		//4. 원본 배열을 새로운 배열로 변경
		arr = temp;
		temp = null;//temp 삭제
		
	}
	//삭제
	static int pop() {
		if(arr.length <= 0) { //배열이 비어있으면 메서드 종료
			return 0;
		}
		//1. 삭제할 데이터를 백업(가장 첫번째 요소)
		int del = arr[0];
		
		//2. arr - 1 크기의 사본 생성
		int[] temp = new int[arr.length - 1];
		
		//3. 윈본배열의 첫번째 ~ 마지막요소까지 옮겨 답는다.
		for(int i = 0; i < temp.length; i++) {
			temp[i] = arr[i+1];
		}
		//4. 원본 배열 복사
			arr = temp;
			temp = null;
		//첫번째 값 반환
		return del;	
	}

}
