package quiz16;

public class Marine extends Unit{
	private static int attack = 6;
	private static int armor = 0;
	
	public Marine(int x, int y) {
		super(x, y, 40);
	}

	@Override
	public void location() {
		System.out.println("마린 현재 위치 : " + this.getX() + ", " + this.getY());
	}

	@Override
	public void move(int x, int y) {
		this.setX(this.getX() + x);
		this.setY(this.getY() + y);
		System.out.println("마린 위치 이동!");
		location();
	}

	@Override
	public void stop() {
		System.out.println("마린 정지!");
		location();
	}

}
