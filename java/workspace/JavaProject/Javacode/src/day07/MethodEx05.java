package day07;

import java.util.Arrays;

public class MethodEx05 {

	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5};
		int a = 10;
		System.out.println(arr);//주소값(배열이 실제로 만들어진 위치)
		System.out.println(a);//값
		
		
		callByValue(a);
		System.out.println(a);
		
		callByReference(arr);
		System.out.println(Arrays.toString(arr));
	}
	//개념적으로 이해
	//값을 복사해서 전달
	//인자에 있는 값만 복사해서 전달했기 때문에 매개변수와 인자는 서로 다른 주소를 참조하고 값만 공유한 상태 이다.
	//따라서 메서드를 종료와 동시에 매개변수에 있는 변수는 사라지면서 더 이상 사용할 수 없게된다.
	static void callByValue(int a) {
		a = 100;
	}
	
	//참조하고있는 주소값을 전달
	//배열자체는 객체이기 때문에 주소값을 참조하고 있다.
	//따라서 주소값을 전달했기 때문에 매개변수와 인자는 서로 같은 주소를 참조하고있어서 
	//메서드안에서 값을 변경해도 변경한 값을 다른 블록에서도 적용된 모습을 볼 수 있다. 
	static void callByReference(int[] arr) {
		arr[0] = 100;
	}

}
