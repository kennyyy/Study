package day14.exception.trycatch;

public class MultiTrycatchEx01 {

	public static void main(String[] args) {
		
		/*
		 * 참고로만 알아두기
		 * 
		 * main도 매개변수를 받을 수 있습니다.
		 * 
		 *  Run -> Run configration -> arguement (공백 기준으로 배열에 값이 들어감)
		 *  
		 *  ${string_prompt} main 매개변수의 입력값을 넣어줄 수 있다
		 *  
		 * 
		 */
		
		try {
			String a1 = args[0];
			String a2 = args[1];
			System.out.println(a1);
			System.out.println(a2);
			
			int a = Integer.parseInt(a1); //문자열을 숫자로 변경하는 기능
			int b = Integer.parseInt(a2);
			
			System.out.println("두 수의 합 : " +(a+b));
			String str = null;
			str.charAt(0);
			
		//상위 예외 클래스가 하위 예외 클래스보다 아래쪽에 위치해야 합니다.
		}catch (ArrayIndexOutOfBoundsException e) { //처리할 예외의 종류가 들어갑니다.
			System.out.println("반드시 매개값을 2개 넣어주세요");
		}catch (NumberFormatException | NullPointerException e) {// | 사용하여 여러개의 예외처리 할수도 있다.
			System.out.println("매개값을 숫자로 입력거나 널 포인터를 참조하였습니다");
		}catch (Exception e) {
			System.out.println("기타 예외 입니다.");
		}
		
		
		
	}
}
