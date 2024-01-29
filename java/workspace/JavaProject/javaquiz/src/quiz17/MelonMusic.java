package quiz17;

public class MelonMusic implements SongList {

	private String[] list = new String[100];
	private int count = 0;
	
	/*
	 * SongList인터페이스를 상속받아서 기능을 구현합니다.
	 * insertList() 는 list배열에 순서대로 저장
	 * playList() list의 음악을 랜덤하게 출력
	 * playLength() 는 저장된 음악의 개수를 반환
	 */
	
	@Override
	public void insertList(String song) {
		// TODO Auto-generated method stub
		if(count >= list.length) {
			System.out.println("더이상 곡을 저장 할 수 없습니다.");
			return;
		}
		list[count++] = song;
		
	}
	@Override
	public void playList() {
		// TODO Auto-generated method stub
		int random = (int)(Math.random() * count);
		System.out.println("랜덤 음악 : " + list[random]);
	}
	@Override
	public int playLength() {
		// TODO Auto-generated method stub
		return list.length;
	}
	

	
}
