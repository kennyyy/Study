package day13.abs.good;

public class MainClass {

	public static void main(String[] args) {
		//추상클래스를 사용하려면, 자식으로 생성해서 추상클래스 타입으로 구체화 시켜야됩니다.
		//[객체의 추상화] 라고 부르기로 약속합시다.
		Store store = new SeoulStore();
		store.apple(); 
		store.melon();
		store.orange();
		store.mango();
		System.out.println(store.getName());
		
		System.out.println("--------------");
		Store store2 = new BusanStore();
		store2.apple(); 
		store2.melon();
		store2.orange();
		store2.mango();
		System.out.println(store2.getName());
	}

}
