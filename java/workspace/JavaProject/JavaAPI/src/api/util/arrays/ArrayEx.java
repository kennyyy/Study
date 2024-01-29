package api.util.arrays;


import java.util.Arrays;


public class ArrayEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {5,6,7,8,9,1,2,3,4};
		String a ="dd";
		a.contains("d");

		//배열의 정렬
		Arrays.sort(arr);
		
		//배열의 모습을 문자열로 표현
		System.out.println(Arrays.toString(arr));
		
		//배열의 복사
		int[] newArr = Arrays.copyOf(arr, arr.length);
		System.out.println( Arrays.toString(newArr)  );
		
		int[] newArr2 = Arrays.copyOf(arr, 3);
		System.out.println( Arrays.toString(newArr2) );
		
		int[] newArr3 = Arrays.copyOfRange(arr, 0, 5); //0~5미만 까지 복사
		System.out.println( Arrays.toString(newArr3) );
		
		//배열의 탐색
		//선행조건은 반드시 정렬
		int index = Arrays.binarySearch(arr, 5); //배열, 찾을값
		System.out.println("5는 " + index + "번째 위치에 있습니다");
		
		int index2 = Arrays.binarySearch(arr, 20);
		System.out.println("찾는 값이 없다면 음수를 반환:" + index2);
		
		//배열의 비교
		if(Arrays.equals(arr, newArr)  ) {
			System.out.println("배열의 요소가 같음");
		}

				
	}

}
