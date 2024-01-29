package quiz06;

public class Parent {
	//부모님 클래스 손가락도 대지 마시오.
	String father;
	String mother;
	
	Parent(String father, String mother){
		this.father = father;
		this.mother = mother;
	}
	Parent(){
		this("부모파덜","부모마덜");
	}
	
	void info() {
		System.out.println("아버지 : " + father + " 어머니 : " + mother);
	}
}
