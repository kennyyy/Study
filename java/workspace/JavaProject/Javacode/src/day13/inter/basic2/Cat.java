package day13.inter.basic2;
public class Cat extends Animal implements IPet{

	@Override
	public void eat() {
		System.out.println("고양이는 생선을 먹어요.");
		
	}

	@Override
	public void play() {
		// TODO Auto-generated method stub
		System.out.println("고양이는 방에서 놀아요.");
	}

}