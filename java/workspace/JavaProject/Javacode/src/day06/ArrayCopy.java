package day06;

import java.util.Arrays;

public class ArrayCopy {

	public static void main(String[] args) {
		//복사의 2가지 개념
		//얕은복사 - 주소값의 복사 
		//깊은복사 - 완전히 새로운 배열을 만들고 요소도 복사
		
		
		//얕은복사
		int[] arr = {1,2,3,4,5};
		int[] arr2 = arr;
		System.out.println("[얕은 복사]");
		System.out.println(arr);
		System.out.println(arr2);
		System.out.println(Arrays.toString(arr));
		System.out.println(Arrays.toString(arr2));
		//주소값이 같다? 
		
		//서로 같은 주소를 참조 하고있기 때문에,
		//둘 중 하나에서 변경되거나 삭제시 다른 배열도 똑같이 변경이 일어난다.
		arr2[0] = 6;
		System.out.println(Arrays.toString(arr));
		System.out.println(Arrays.toString(arr2));
		System.out.println();
		
		//깊은복사
		//서로 다른 주소를 참조하고 있기 때문에,
		//값을 바꾸더라도 원본에 영향이 없다.
		int[] newArr = new int[arr.length];
		
		for(int i = 0; i< newArr.length; i++) {
			newArr[i] = arr[i];
		}
		System.out.println("[깊은 복사]");
		System.out.println(arr);
		System.out.println(newArr);
		System.out.println(Arrays.toString(arr));
		System.out.println(Arrays.toString(newArr));
		newArr[0] = 6;
		System.out.println(arr);
		System.out.println(newArr);
		System.out.println(Arrays.toString(arr));
		System.out.println(Arrays.toString(newArr));
		System.out.println();
		
		//깊은복사 메소드
		int[] deepCopy = Arrays.copyOf(arr, arr.length);//복사할배열, 복사할길이
		System.out.println(arr);
		System.out.println(deepCopy);
 	}

}
