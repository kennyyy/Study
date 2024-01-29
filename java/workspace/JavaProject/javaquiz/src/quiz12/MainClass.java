package quiz12;

public class MainClass {
	public static void main(String[] args) {
		//bash()확인용
		Warrior my_war = new Warrior("나는전사");
		Wizard my_wiz = new Wizard("나는법사");
		
		Warrior you_war = new Warrior("너는전사");
		Wizard you_wiz = new Wizard("너는법사");
		
		my_war.bash(you_wiz);
		my_war.bash(you_war);
		my_wiz.iceArrow();
		
		//blizzard()확인용
		Warrior wari1 = new Warrior("전사홍길동");
		Warrior wari2 = new Warrior("전사이길동");
		Warrior wari3 = new Warrior("전사김길동");
		Wizard wiz1 = new Wizard("법사홍길동");
		Wizard wiz2 = new Wizard("법사이길동");
		Wizard wiz3 = new Wizard("법사김길동");
		Player[] player = {wari1,wari2,wari3,wiz1,wiz2,wiz3};
		
		my_wiz.blizzard(player);
		
		
		
	}
}
