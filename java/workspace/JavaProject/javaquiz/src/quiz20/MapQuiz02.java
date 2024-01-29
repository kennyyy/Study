package quiz20;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.Map.Entry;

public class MapQuiz02 {

	public static void main(String[] args) {
		
		//메뉴관리 프로그램
		//맵을 사용하고 메뉴명을 key, 가격을 value 사용합니다.
		
		Scanner scan = new Scanner(System.in);
		Map<String, Integer> data = new HashMap<String, Integer>();
		
		bye:while(true) {
			
			System.out.println("-----메뉴관리-----");
			System.out.println("1. 메뉴등록(이미 등록된 메뉴인지 확인후에 등록)");
			System.out.println("2. 전체메뉴보기");
			System.out.println("3. 메뉴수정(변경할 메뉴를 받아서 메뉴가 있다면 가격을 수정)");
			System.out.println("4. 메뉴삭제(변경할 메뉴를 받아서 메뉴가 있다면 삭제)");
			System.out.println("5. 프로그램종료");
			
			System.out.print("메뉴명>");
			String menu = scan.next();
			
			switch (menu) {
			case "1":
				System.out.print("등록할 메뉴명 : ");
				String addMenu = scan.next();
				System.out.print("등록할 메뉴의 가격 : ");
				int addPrice = scan.nextInt();
				
				if(!data.containsKey(addMenu)) {
					data.put(addMenu, addPrice);
				}
					
				break;
			case "2":
				Set<Map.Entry<String, Integer>> s = data.entrySet();
				for(Map.Entry<String, Integer> entry : s) {
					System.out.println("[메뉴명] : " + entry.getKey() + "  [가격] : " + entry.getValue() + "원");
				}
				
				break;
			case "3":
				System.out.print("수정할 메뉴명 : ");
				String updateMenu = scan.next();
				if(!data.containsKey(updateMenu)) {
					System.out.println("그런 메뉴는 없어!");
					break;
				}
				System.out.print("수정할 가격 : ");
				int updatePrice = scan.nextInt();
				data.put(updateMenu, updatePrice);
				
	
				break;
			case "4":
				System.out.print("삭제할 메뉴명 : ");
				String deleteMenu = scan.next();
				if(!data.containsKey(deleteMenu)) {
					System.out.println("그런 메뉴는 없어!");
					break;
				}
				data.remove(deleteMenu);
				
	
				break;
			case "5":
				//System.exit(0);
				break bye;

			default:
				System.out.println("잘못 입력");
				break;
			}
			
			
		}
		
		
		
		
	}
}
