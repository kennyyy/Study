package anonymous.basic02;

public class Tv {

	private int volume;
	private RemoteControl remote;
	
	public Tv() {
		//remote타입을 Tv에 알맞게 익명객체 방법으로 초기화해주세요.
		remote = new RemoteControl() {
			
			@Override
			public void volumeUp() {
				volume++;
				System.out.println("Tv의 볼륨:" + volume);
			}
			
			@Override
			public void volumeDown() {
				volume--;
				System.out.println("Tv의 볼륨:" + volume);
			}
			
			@Override
			public void turnOn() {
				System.out.println("Tv를 켭니다");
			}
			
			@Override
			public void turnOff() {
				System.out.println("Tv를 끕니다");				
			}
		};
	}
	
	
	//게터 세터
	public RemoteControl getRemote() {
		return remote;
	}
	
	public void setRemote(RemoteControl remote) {
		this.remote = remote;
	}
	
}
