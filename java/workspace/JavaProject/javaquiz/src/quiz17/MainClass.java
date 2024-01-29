package quiz17;

import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		//melon뮤직처럼
		SongList list = new BugsMusic();//new MelonMusic();
		
		while(true) {
			
			System.out.println("메뉴)1.음악추가 2.음악재생 3.음악개수확인");
			int menu = scan.nextInt();
			
			if(menu == 1) {
				
				System.out.print("음악입력>");
				String song = scan.next();
				list.insertList(song);
				
			} else if( menu == 2) {
				
				list.playList();
			} else if( menu == 3) {
				
				int count = list.playLength();
				System.out.println("음악개수:" + count);
			}
			
			
		}
	}

}
