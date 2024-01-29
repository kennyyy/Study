package day08.override.basic;

public class MainClass {

	public static void main(String[] args) {
		Parent p = new Parent();
		p.method01();
		p.method02();
		
		Child c = new Child();
		c.method01(); //물려받은 메서드 1번 실행됨
		c.method02(); //오버라이드 된 메서드 2번 실행됨
	}

}
