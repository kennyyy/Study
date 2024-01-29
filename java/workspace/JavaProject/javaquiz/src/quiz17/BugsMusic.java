package quiz17;

public class BugsMusic implements SongList {
	/* SongList인터페이스를 상속받습니다.
	 * 마음대로 작성.
	 * 
	 */
	
	private String[] list = new String[100];
	private int count = 0;
	@Override
	public void insertList(String song) {
		System.out.println(song + "을 추가합니다");
		list[count] = song;
		count++;
	}
	@Override
	public void playList() {
		System.out.println("음악을 재생합니다");
		for(int i = 0; i < count; i++) {
			System.out.println(list[i]);
		}
		
	}
	@Override
	public int playLength() {
		System.out.println("현재 음악개수를 반환합니다");
		return count;
	}
	
	
}
