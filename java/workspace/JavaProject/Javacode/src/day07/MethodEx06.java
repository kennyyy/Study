package day07;

public class MethodEx06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//메서드의 연쇄 호출(동기적 처리)
		test01();
		
		//메서드의 재귀함수
		//그냥 재귀함수를 호출하면 무한히 메서드를 호출해서 StackOverflow 에러가 발생한다.
		//그럼므로 재귀는 반복과 비슷하지만 탈출 조건이 무조건 필요하다.
		recursive(1);
	}
	
	static void test01() {
		System.out.println("test01 시작");
		test02();//test02메서드를 종료되면 다음으로 넘어간다.
		System.out.println("test01 끝");
	}
	static void test02() {
		System.out.println("test02 시작");
		//test01(); 탈출조건이 없어서 서로를 무한 호출한다.
		System.out.println("test02 끝");
	}
	
	
	static void recursive(int a) {
		System.out.println(a);
		if(a==10) { //재귀함수는 탈출조건을 만나야 마지막호출 메서드가 종료 됨으로써
					//나머지 호출된 메서드도 종료가 일어난다.
			return;
		}
		a++;
		recursive(a); //(나자신)재귀함수 호출
		System.out.println(a + "함수 종료됨");//바로위에 메서드가 종료되면 (나자신)메서드도 종료를 할 수 있게된다.
										  //거꾸로된 반복이라 생각하자
	}


}
