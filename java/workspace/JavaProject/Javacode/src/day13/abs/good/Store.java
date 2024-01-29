package day13.abs.good;

public abstract class Store {
	//추상클래스
	//1. 클래스에 abstract를 붙이면 추상클래스가 됩니다.
	//2. 메서드에 abstract를 붙이면 추상메서드가 됩니다.
	//3. 추상메서드는 {}가 없는(내용이 없는) 메서드의 선언 입니다.
	//4. 추상메서드는 추상클래스에서만 선언이 가능합니다.(소울메이트)
	//5. 추상클래스도 생성자, 일반메서드, 멤버변수 모두 가질 수 있습니다.
	
	private String name = "호식이 과일가게";
	
	public final void mango() {//final은 오버라이드 금지
		System.out.println("본점에서 1000원 고정가격 입니다.");
	}
	public Store() {
		System.out.println("추상클래스의 생성자 호출됨");
	}
	
	public String getName() {
		return name;
	}
	
	
	public abstract void apple();
	
	public abstract void melon();
	
	public abstract void orange();

}
