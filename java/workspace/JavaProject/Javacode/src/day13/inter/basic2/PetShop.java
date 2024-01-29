package day13.inter.basic2;

public class PetShop {
	//각각의 펫들을 저장할 수 있는 클래스
	
	//1. static carePet()
	//매개변수는 펫타입으로 받아서 원본 타입으로 캐스팅 하는기능
	
	
	public static void carePet(IPet ipet) {
		if(ipet instanceof Cat) {
			Cat c = (Cat)ipet;
			c.eat();
		}else if(ipet instanceof Dog) {
			Dog d = (Dog)ipet;
			d.eat();
		}else if(ipet instanceof GoldFish) {
			GoldFish gf = (GoldFish)ipet;
			gf.play();
		}
		
	}
	
	
	//2. static petInfo()
	//매개변수로 펫배열 타입을 받아서 play() 출력.
	
	public static void petInfo(IPet[] ipet) {
		for(IPet i : ipet) {
			i.play();
		}
	}
	
}
