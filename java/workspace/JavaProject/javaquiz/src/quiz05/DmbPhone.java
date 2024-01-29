package quiz05;

public class DmbPhone extends Phone  {
	//DmbPhone은 Phone클래스를 상속 받습니다.
	//channel 변수를 생성하고, color, model, channel을 초기화 하는 생성자를 작성하세요.
	//메인메서드가 정상적으로 실행되도록 메서드를 추가하세요.
	int channel;
	
	
	DmbPhone(String pColor, String pModel, int pChannel){
		color = pColor;
		model = pModel;
		channel = pChannel;
	}
	//DmbPhone에서 선언한 메서드 호출
	//dp.turnOnDmb(); //기능: TV를 켭니다 출력
	//dp.changeChannel(7); //기능: channel변수를 전달받은 변수로 변경후 출력
	//dp.turnOffDmb(); //기능: TV를 끕니다 출력
	
	void turnOnDmb() {
		System.out.println("TV를 켭니다.");
	}
	void turnOffDmb() {
		System.out.println("TV를 끕니다.");
	}
	void changeChannel(int ch) {
		channel = ch;
		System.out.println("채널이 " + channel + "로 변경되었습니다.");
	}

		

}
