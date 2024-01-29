package quiz05;

public class PlayerMain {

	public static void main(String[] args) {
		Warrior wr = new Warrior("전사");
		wr.bash();
		wr.info();
		
		Wizard wz = new Wizard("마법사");
		wz.iceArrow();
		wr.info();
	}

}
