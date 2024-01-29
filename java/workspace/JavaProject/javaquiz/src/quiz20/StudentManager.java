package quiz20;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentManager {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		/////////////////////////////////////////////////////////////
		//////////////////////리스트를 생성하세요///////////////////////////
		/////////////////////////////////////////////////////////////
		List<User> list = new ArrayList<User>();
		//현재 고객수가 몇명이 저장되어있는지 알기 위한 변수.
		int count = 0;
		
		ex:while(true) {
			
			//메뉴
			System.out.println("[Info]-고객수:" + count);
			System.out.println("[메뉴]1.추가, 2.전체보기, 3.정보검색, 4.정보수정, 5.정보삭제, 6.나가기");
			System.out.print("메뉴입력>");
			String menu = scan.next();
			
			switch(menu) {
			
			case "1":
				System.out.println("=========고객 정보 입력==========");
				/*
				 * 1. 이름과, 나이를 입력받고, 배열에 순서대로 값을 저장합니다.
				 * 2. count값을 증가
				 * 
				 */
				System.out.print("이름 : ");
				String name = scan.next();
				System.out.println("나이 : ");
				int age = scan.nextInt();
				
				list.add(new User(name,age));
				count++;
				
				System.out.println("=============================");
				break;
			case "2":
				System.out.println("========전체 고객정보 출력=========");
				/*
				 * 1. 배열에 저장된 고객정보 "name~님의 나이는 age입니다." 전부출력 
				 */
				for(User user: list) {
					System.out.println(user.getName() + "님의 나이는 " + user.getAge()+ "입니다.");
				}
			
				System.out.println("=============================");
				break;
			case "3":
				System.out.println("==========고객 정보 검색==========");
				/*
				//찾을 이름을 입력받습니다. 이름이 있다면, 이름과 나이를 출력합니다.
				//찾는 이름 없다면 "~~님은 목록에 없습니다" 를 출력합니다.
				 */
				System.out.print("이름 : ");
				String searchName = scan.next();
				
				boolean searhTrue = false;
				
				for(User user: list) {
					if(user.getName().equals(searchName)) {
						System.out.println("이름 : " + user.getName() + ", 나이 : " + user.getAge());
						searhTrue = true;
					}
				}
		
				if(!searhTrue) {
					System.out.println(searchName+ "님은 목록에 없습니다.");
				}
				
				System.out.println("=============================");
				break;
			case "4":
				System.out.println("==========고객 정보 수정=========");
				/*
				 * 1. 모든 list에 저장된 정보를 출력해줍니다.
				 * 2. 수정할 index를 입력 받습니다.
				 * 3. 수정할 name, age으로 수정합니다.
				 */
				for(User user: list) {
					System.out.println(user.getName() + "<< 이름 " + user.getAge()+ " <<나이");
				}
				
				System.out.print("수정할 Index : ");
				int updateIndex = scan.nextInt();
				if(updateIndex >= count) {
					System.out.println("수정할 Index가 아닙니다!");
					break;
				}
				
				System.out.print("수정할 이름 : ");
				String updateName = scan.next();
				System.out.println("수정할 나이 : ");
				int updateAge = scan.nextInt();
				
				list.set(updateIndex, new User(updateName, updateAge));
				
				System.out.println("=============================");
				break;
			case "5":
				System.out.println("==========고객 정보 삭제==========");
				/*
				 * 1. 먼저 모든 name을 출력해서 볼 수 있게 처리
				 * 2. 삭제할 이름을 입력을 받습니다.
				 * 3. 이름이 있다면 객체 삭제
				 */
				for(User user: list) {
					System.out.println(user.getName() + "<< 이름 ");
				}
				System.out.print("삭제할 이름 : ");
				String deleteName = scan.next();
				
				boolean DeleteTrue = false;
				User delUser = null;
				for(User user: list) {
					if(user.getName().equals(deleteName)) {
						delUser = user;
						break;
					}
				}
				if(!DeleteTrue) {
					System.out.println(deleteName+ "님은 목록에 없습니다.");
					break;
				}
				list.remove(delUser);
				count--;
				
				
				
				System.out.println("=============================");
				break;
			case "6":
				System.out.println("=============================");
				System.out.println("===========프로그램 종료==========");
				System.out.println("=============================");
				
				//while탈출 하면 됩니다.
				break ex;
				
			default :
				System.out.println("===========================");
				System.out.println("========메뉴는 숫자로 입력=======");
				System.out.println("===========================");
				break;
			}
			
			
		}
		
		
		
		
		
		
		
		
		
	}
}
