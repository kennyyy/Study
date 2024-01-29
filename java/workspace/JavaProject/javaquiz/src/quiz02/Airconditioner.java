package quiz02;

public class Airconditioner {
	int temperature; // 온도
	int wind;//바람세기
	int modeCount; //에어컨 모드 카운트
	String mode;//에어컨 모드 온풍 냉풍
	Boolean on_off;//전원	끄기 켜기
	
	
	Airconditioner(int t, int w, Boolean of){
		temperature = t;
		wind = w;
		on_off = of;
		modeCount = 0;
		mode = "냉풍";
	}
	
	void turnOnOff() {
		if(on_off) {
			on_off = false;
			System.out.println("에어컨이 꺼집니다.");
		}
		else {
			on_off = true;
			System.out.println("에어컨이 켜집니다.");
		}
	
	}
	
	void controlTemp(int temp) {
		temperature = temp;
		System.out.println("온도 변경!");
	}
	
	void controlWind() {
		wind++;
		if(wind > 3) {
			wind = 1;
		}
		System.out.println("현재 바람세기 변경!");
	}
	void controlMode() {
		modeCount++;
		if(modeCount == 0 || modeCount > 2){
			mode = "냉풍";
		}else if(modeCount == 1) {
			mode = "온풍";
		}else if(modeCount == 2) {
			mode = "자연풍";
		}
		System.out.println("모드 변경!");
		
	}
	void airInfo() {
		System.out.println("현재 온도 : " + temperature);
		System.out.println("현재 바람세기 : " + wind);
		System.out.println("현재 모드 : " + mode);
	}
	public static void main(String[] args) {
		Airconditioner ac = new Airconditioner(25, 1, false);
		System.out.println("---초기 상태---");
		ac.airInfo();
		System.out.println("-------------");
		System.out.println("---작동 시작---");
		
		ac.turnOnOff();
		ac.controlTemp(30);
		ac.controlWind();
		ac.controlMode();
		ac.airInfo();
		ac.turnOnOff();
	}

}
