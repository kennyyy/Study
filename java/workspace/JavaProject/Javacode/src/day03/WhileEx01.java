package day03;

public class WhileEx01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 1; // 1.제어변수 - 반복문의 횟수를 제어할 변수
		
		int sum = 0;
		while(a <= 10) { //2. 제어변수로 조건을 생성
			sum += a;
			a++; //3. 반복을 돌 때마다 제어변수를 증가해서 언젠가는 조건이 false가 되면 반복문 탈출
		}
		System.out.print("합계 : " + sum);
	}

}
