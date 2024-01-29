package day12.static_.method;

public class MainClass {

	public static void main(String[] args) {
		// main은 static입니다.
		// a변수를 사용하고 싶으면 객체생성을 해서 사용함.
		Count c = new Count();
		c.method();
		
		//static멤버를 호출할 때
		Count.b++;
		Count.method2();
		
		//현재 b는 몇일까요? 
		//3이다.
		
		
		
		Integer.parseInt("3"); //이런게 왜 객체 생성없이 사용 가능했을까?
		Math.random(); //static이라서 가능한 것이였다!!! ㄷㄷ

	}

}
