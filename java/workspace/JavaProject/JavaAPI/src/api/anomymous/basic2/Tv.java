package api.anomymous.basic2;

public class Tv {
	private int volume;
	private RemoteControl remote;
	
	public Tv() {
		String name = "LG TV"; //지연번수
		remote = new RemoteControl() {
			//익명객체 안에서는 this키워드 사용이 불가함
			//익명객체 안에서는 지역변수의 값을 변경이 불가능(사용은 가능)
			
			@Override
			public void volumeUp() {
				Tv.this.volume++; //Tv의 멤버변수에 접근이 가능하다. (Tv.this 로 접근)
				System.out.println(volume);
				
				//name = "이렇게 바꿀래";
				
			}
			
			@Override
			public void volumeDown() {
				volume--; //Tv의 멤버변수에 접근이 가능하다.
				System.out.println(volume);
				
			}
			
			@Override
			public void turnOn() {
				System.out.println("Tv를 켭니다.");
			}
			
			@Override
			public void turnOff() {
				System.out.println("Tv를 끕니다.");
			}
		};
	}
		
	//Remote 외부에서 받으러면
	//setter
	public void setRemote(RemoteControl remote) {
		this.remote = remote;
	}
	//getter
	public RemoteControl getRemote() {
		return remote;
	}
	
		
}

	


