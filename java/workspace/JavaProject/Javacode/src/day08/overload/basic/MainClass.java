package day08.overload.basic;

public class MainClass {

	public static void main(String[] args) {
		Basic bs = new Basic();
		
		bs.input(1);
		bs.input(1,2);
		bs.input("홍길동", 3.14);
		bs.input(3.14, "홍길동");
		bs.input('A', 20,"홍길동");
		
	}
}
