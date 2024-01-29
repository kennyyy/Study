package day08;

public class VarMain {

	public static void main(String[] args) {
		Variable var1 = new Variable();
		
		//멤버변수는 클래스 외부에서 접근이 가능합니다.(값의 변경)(Variable클래스의 접근제어자가 public이라 그런건데 나중에 다룰예정이니 그냥 넘기자) 
		System.out.println(var1.a);
		var1.a = 10;
		System.out.println(var1.a);
		
		//여기서 매개변수에 값을 넣기때문에 매개변수는 초기값 없어도된다.

		var1.printNum(200);
		

	}

}
