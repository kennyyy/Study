package quiz12;

public class Warrior extends Player {
	
	//Player클래스로 상속관계를 만들어 주세요
		//전사는 생성될 때 ★이름만 매개변수로 받고, hp = 100, mp = 50이 됩니다.
		//전사는 강력한 bash()를 가지고 있습니다
		//bash()는 호출될떄마다 mp를 -10씩 감소시킵니다
	
	
	//1. 생성자가 정상적으로 연결될 수 있도록 부모클래스와 연결
	Warrior(String name){
		super(name, 100, 50);
		
		}
	
	//1. bash는 매개변수로 전사 or 마법사가 대상이 됩니다.
	//2. bash스킬을 사용하면 나의 mp가 -10씩 소모가 됩니다.
	//3. 나의 mp가 100이하면 스킬을 사용할 수 없습니다.
	//4. 대상이 전사라면 상대방의 hp를 -10 감소 시킴
	//	 대상이 마법사라면 상대방의 hp를 -20 감소 시킴
	void bash(Player p) {
		if(getMp() < 10) {
			System.out.println("스킬 사용 불가");
			return ;
		}
		System.out.println("----------------------------");
		System.out.println("[스킬 사용] bash! [mp]10감소");
		System.out.println("상대가 전사라면 [hp]10감소");
		System.out.println("상대가 법사라면 [hp]20감소");
		System.out.println("[나의 정보]");
		super.setMp(getMp()-10);
		info();
		
		
		if(p instanceof Warrior) {
			p.setHp(p.getHp()-10);
			
		}else if(p instanceof Wizard) {
			p.setHp(p.getHp()-20);
		}
		System.out.println("----------------------------");
		System.out.println("[대상 정보]");
		p.info();
	}
}
