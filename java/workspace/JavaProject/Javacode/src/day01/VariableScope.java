package day01;


public class VariableScope {	
	public static void main(String[] args) {
		int num1 = 10;
		int num2 = 20; 
		//int num1 = 10, num2 = 20; 같은 타입변수는 나열이 가능하다
		
		int num4 = 0;
		if(true) {
			int num3 = num1 + num2;
			System.out.println(num3); //30
			
			num4 = 1000;
		}
		
		//System.out.println(num3);// 중괄호에서 선언된 변수는 중괄호안에서만 유효함
		int num3 = 100; // 중괄호에서 선언된 변수는 중괄호 바깥에서는 사라지기 때문에,
				 	 	// 선언가능
		
		num4 = 10000;
		System.out.println(num4); //10000
				
	}
}
