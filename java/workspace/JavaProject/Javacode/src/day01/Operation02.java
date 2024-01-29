package day01;

public class Operation02 {

	public static void main(String[] args) {
		//산술연산자
		int i = 7 / 3; //몫 2
		int j = 7 % 3; //나머지 1
		int k = 7 * 3; //21
		
		//비교연산자
		//i = 2 ,j = 1 , k = 21
		System.out.println(i == j); //false
		System.out.println(i != j); //true
		System.out.println(i >= j); //true
		System.out.println(i < j); //false
		System.out.println(k != 21); //false
		System.out.println(k % 2 == 1); //true
		System.out.println(k % 2 != 0); //true
		
		//비트연산자 & | ^
		int a = 5; //0000 0101
		int b = 3; //0000 0011
		
		System.out.println(a & b); // 0000 0001 두 비트가 1일 때 1, 아니면 0
		System.out.println(a | b); // 0000 0111 두 비트중 하나만 1이면 1, 아니면 0
		System.out.println(a ^ b); // 0000 0110 다르면 1, 같으면 0
		
		//비트쉬프트 >> <<
		
		int h = 192; // 1100 0000
		System.out.println(h<<2); // 0011 0000 0000 오른쪽 두칸이동
		
	}

}
