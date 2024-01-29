package quiz34;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

public class MenuManager {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		//맵을 이용하는데 key : 메뉴이름  value: 가격
		Map<String, Integer> map = new HashMap<>();

		while(true) {

			System.out.println("-----음식 메뉴 관리------");
			System.out.println("1. 신규 메뉴 등록"); //이미 등록된 메뉴인지 확인 후에 메뉴 등록
			System.out.println("2. 메뉴판 전체 보기"); //메뉴와 가격을 전부 출력
			System.out.println("3. 메뉴판 수정"); //변경할 메뉴를 받아서 메뉴가 있다면 가격을 수정
			System.out.println("4. 메뉴판 삭제"); //변경할 메뉴를 받아서 메뉴가 있다면 삭제
			System.out.println("5. 프로그램 종료"); //종료

			System.out.print("메뉴입력>");
			int menu = scan.nextInt();

			if(menu == 1) {
				System.out.print("메뉴명입력>");
				String name = scan.next();

				if(map.containsKey(name)) { //메뉴가 있는 경우

					System.out.println(name + "은 이미 등록된 메뉴 입니다");

				} else { //메뉴가 없는 경우
					
					System.out.print("가격입력>");
					int price = scan.nextInt();
					map.put(name, price); //추가
					
				}


			} else if(menu == 2) { //메뉴판 전체 보기
				
				Set<Entry<String, Integer>> set = map.entrySet();
				Iterator<Entry<String, Integer>> iter = set.iterator();
				
				
				System.out.println("--------MENU--------");
				while(iter.hasNext()) { //다음확인
					
					 String key = iter.next().getKey();
					 System.out.println("메뉴:" + key + ", 가격:" + map.get(key));	
				}
				
				
			} else if(menu == 3) {// 메뉴판 수정

				System.out.print("가격을 변경할 메뉴를 입력하세요>");
				String name = scan.next();
				
				if(map.containsKey(name)) { //찾은경우
					System.out.print("수정할 가격>");
					int price = scan.nextInt();
					
					System.out.println(map.get(name) + "원->" + price + "원");
					map.put(name, price);
					
				} else {
					System.out.println("해당 메뉴는 없습니다");
				}
				
			} else if(menu == 4) { //삭제

				System.out.print("삭제할 메뉴명 입력>");
				String name = scan.next();
				
				if(map.containsKey(name)) {
					map.remove(name); //삭제
					System.out.println(name + "이 삭제 되었습니다");
				} else {
					System.out.println(name + "은 없는 메뉴입니다");
				}
			} else if(menu == 5) {
				
				System.out.println("프로그램을 종료합니다");
				scan.close();
				System.exit(0);
			}

		}


	}
}
