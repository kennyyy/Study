package day14.exception.trycatch;

public class TrycatchEx02 {

	public static void main(String[] args) {
		
		String[] arr = {"홍길동", "이순신", "피카츄"};
		
		int i = 0;
		while(i < 4) { 
			try {
				System.out.println(arr[i]);
			}catch (Exception e) {
				System.out.println("배열 범위를 벗어났습니다.");
			}finally {
				System.out.println("이 문장은 예외 여부와 상관없이 무조건 실행됩니다.");
			}
			
			i++;
		}
		System.out.println("프로그램 정상종료");
		
		
	}
}
