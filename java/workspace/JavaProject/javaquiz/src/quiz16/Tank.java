package quiz16;

public class Tank extends Unit{
	private static int attack = 30;
	private static int armor = 1;
	private boolean changeMode = false;
	
	public Tank(int x, int y) {
		super(x, y, 150);
	}
	@Override
	public void location() {
		System.out.println("탱크 현재 위치 : " + this.getX() + ", " + this.getY());
	}

	@Override
	public void move(int x, int y) {
		this.setX(this.getX() + x);
		this.setY(this.getY() + y);
		System.out.println("탱크 위치 이동!");
		location();
	}

	
	void changeMode() {
		this.changeMode = !changeMode;
		if(!changeMode) {
			System.out.println("기본 모드로 변경합니다.");
			attack = 30;
		}else {
			System.out.println("시즈 모드로 변경합니다.");
			attack = 70;
		}
	}

}
