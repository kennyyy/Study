import java.util.Arrays;

public class CodingT02 {

	public static void main(String[] args) {
		
		/*
		 * 배열병합
		 * 임이의 알파벳 대문자를 담은 무작위 길이의 배열A, B와 각 배열의 길이 A_LEN, B_LEN이 주어지면
		 * 다음과 같은 조건으로 두배열을 병합하고, 합쳐진 새로운 배열 C를 return하는 함수를 작성하세요
		 * 
		 * 배열 병합 조건
		 * 1. A의 데이터는 순서대로 C의 0,2,4 ...번 인덱스에 삽입됩니다.
		 * 2. B의 데이터는 순서대로 C의 1,3,5 ...번 인덱스에 삽입됩니다.
		 * 3. B의 데이터를 모두 삽입해도 A의 데이터가 모두 삽입되지 않았을 경우, 다시 B의 첫 번째 데이터부터 삽입합니다.
		 * 4. A의 데이터가 모두 삽입된 경우, 이에 대응하는 B데이터까지 삽입해야 병합이 완료됩니다.
		 * 
		 * 조건
		 * 1. A_LEN은 B_LEN보다 크거나 같음
		 * 2. A_LEN은 B_LEN의 2배 이하임
		 * 3. A_LEN, B_LEN 모두 0보다 크고, 100보다는 작음
		 * 
		 * ex) 
		 * 	a = {'A', 'B', 'C', 'D', 'E'};
		 *	b = {'X', 'Y'};
		 *  c = {A, X, B, Y, C, X, D, Y, E, X};
		 *
		 *  a = {'A', 'B', 'C', 'D'}
		 *  b = {'X', 'Y', 'Z'}
		 *  c = {A, X, B, Y, C, Z, D, X}

		 */
		
		//char[] a = {'A', 'B', 'C', 'D', 'E'};
		//char[] b = {'X', 'Y'};
		
		char[] a = {'A', 'B', 'C', 'D'};
		char[] b = {'X', 'Y', 'Z'};
				
		
		
		System.out.println( Arrays.toString(test(a, b))  );
	}

	public static char[] test(char[] arr1, char[] arr2) {

		char[] newArr = new char[arr1.length * 2];

		int index1 = 0;
		int index2 = 0;		
		for(int i = 0 ; i < newArr.length; i++) {
			
			if(i % 2 == 0) { //짝수인경우
				newArr[i] = arr1[index1++]; 
			} else {//홀수인경우
				newArr[i] = arr2[index2++];
				if(index2 == arr2.length) 
					index2 = 0;
			}
		}


		return newArr;
	}

}
