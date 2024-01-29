package quiz06;

public class Child extends Parent {
	
	//Child는 생성자로 부모님 이름을 전달받아서 초기화 할 수 있도록 하는 문법 작성.
	Child(String father, String mother){
		super(father, mother);
	}
}
