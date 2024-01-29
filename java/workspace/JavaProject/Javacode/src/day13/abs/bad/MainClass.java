package day13.abs.bad;

public class MainClass {

	public static void main(String[] args) {
		SeoulStore store = new SeoulStore();
		store.apple(); //apple은 반드시 오버라이딩 해야하는데, 잘못된 메서드 호출로 연결될 수 있다.
		store.melon();
		store.orange();
	}

}
