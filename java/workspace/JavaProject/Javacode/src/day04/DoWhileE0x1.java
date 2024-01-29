package day04;

public class DoWhileE0x1 {

	public static void main(String[] args) {
		//while문으로 1~10까지 합계
		
		int sum = 0;
		int i = 1;
		//do 먼저 실행 ,조건식이 맞지않아도 최소 한번은 실행
		do {
			sum+=i;
			i++;
	
		}
		//조건이 true이면 계속 실행
		while(i<=10);
		
		System.out.println("합계 : "+ sum);

	}

}
