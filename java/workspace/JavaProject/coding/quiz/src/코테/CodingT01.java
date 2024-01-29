
public class CodingT01 {

	public static void main(String[] args) {
		/*
		 * 자연수의 자리수 합 구하기
		 * 자연수 n이 주어지면 n의 각 자리수의 합을 구해서 return하는 메서드를 작성해 주세요
		 * 조건
		 * n은 1억 이하의 자연수
		 * n을 자료형 변환해서 연산하지 말것
		 */
		System.out.println(test01(12345678));
		System.out.println(test02(12345678));
		
		System.out.println(test01(0));
		System.out.println(test02(0));

		System.out.println(test01(100000000));
		System.out.println(test02(100000000));
	
		System.out.println(test01(345));
		System.out.println(test02(345));
		
	}
	//자료형 변환 x방법
	public static int test01(int num) {
		
		int sum = 0;
		for(int i = 100000000; i >= 1; i/=10) {

			if ( num / i != 0) {
				sum += (num / i);
				
				num -= (num / i) * i; //num %= i;
			}
		}
		return sum;
	}
	
	//자료형 변환 방법
	public static int test02(int num) {
		
		String s = String.valueOf(num);

		int sum = 0;
		for(int i = 0; i < String.valueOf(s).length(); i++) {
			sum += Integer.parseInt(s.charAt(i) + "");
		}  
		
		return sum;
	}
	
	
}
