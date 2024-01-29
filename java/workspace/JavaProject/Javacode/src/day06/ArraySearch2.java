package day06;

import java.util.Arrays;

public class ArraySearch2 {

	public static void main(String[] args) {
		//이진탐색 - 배열에서 반을 잘라가면서 값을 찾는 방법
		//조건 - 반드시 정렬이 되어있어야 합니다.
		
		//1. 위치변수(start ,end)를 처음과 끝에 지정
		//2. 중간값을 구함
		//3. 중간값 == 찾는값인지 확인
		//4. 중간값이 찾는값보다 크다면, end = 중간값 -1
		//5. 중간값이 찾는값보다 작으면, start = 중간값 +1로 내림
		//6. 서로 start와 end가 교차하면 값을 찾았거나 못찾은 경우다.
		
		int [] arr = {1, 2, 3, 4,5, 10, 20, 30, 50, 80, 100};

		int find = 50;
		
		int start = 0;
		int end = arr.length-1;

		
		int cnt = 0;
		
		while(start < end) {
			int mid = (start+end)/2;
			cnt++;
			
			if(find == arr[mid]) {
				System.out.println(find+"는 " +mid+"번째에 있습니다.");
				break;
			}else if(find > arr[mid]) {
				start = mid+1;
			}else {
				end = mid-1;
			}
		}
		
		if(start > end) {
			System.out.println(find+" 는 없습니다.");
		}
		System.out.println("총 반복 횟수 :"+ cnt);
		
		System.out.println("------------------------");
		System.out.println("-- binarySerach 메소드 ---");
		//찾는값이 있으면 인덱스위치 반환
		System.out.println(Arrays.binarySearch(arr, 50));
		//찾은값이 없으면 음수 반환
		System.out.println(Arrays.binarySearch(arr, 12));

	}

}
