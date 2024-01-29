package day11.modi.member.pac1;

public class A {
	//생성자에 접근제어자
	public A(int i) {}
	A(boolean b) {}
	private A(String s) {}
	
	//생성자에서 private붙여서 외부에서 객체 생성을 못하도록 처리하기도 함
	
	//--------------------------------------------------
	
	//멤버변수 접근제어자
	public int var1;
	int var2;
	private int var3;
	
	//메서드 접근제어자
	public void method01() {}
	void method02() {}
	private void method03() {}
	
	public A() {
		//A에서는 모두 접근 가능
		this.var1 = 1;
		this.var2 = 2;
		this.var3 = 3;
		
		method01();
		method02();
		method02();
	}
	
}
