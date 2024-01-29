package day06;

import java.util.Scanner;

public class StudentManager {

	public static void main(String[] args) {
		//---------------
		//고객 정보 관리 프로그램
		//---------------
		
		//배열의 크기는 신경 x
		//현재 고객수가 몇명이 저장되어있는지 알기 위한 변수.
		Scanner sc = new Scanner(System.in);
		
		String[] nameList = new String[100];
		int[] ageList = new int[100];
		
		int count = 0; //고객 수
		boolean exit = false;//프로그램 종료	
		
		
		while(true) {
		
			System.out.println("[Info] - 고객수 : " + count);
			System.out.println("[메뉴] : [1.고객추가] [2.전체보기] [3.정보검색] [4.정보수정] [5.정보삭제] [6.프로그램 종료]\n");
			System.out.print("메뉴입력 > ");
			String menu = sc.next();
			
			System.out.println();
			switch (menu) {
			
			case "1":
				
				System.out.println("=====고객 정보 입력=====");
				//이름과 나이를 입력받고, 
				System.out.println("고객님의 정보를 추가하겠습니다. [이름과 나이를 입력해주세요.]");
				System.out.print("이름 입력 : ");
				String name = sc.next();
				System.out.print("나이 입력 : ");
				int age = sc.nextInt();
				
				//배열에 순서대로 값을 저장합니다.
				nameList[count] = name;
				ageList[count] = age;
				
				//count값을증가
				count++;
				
				System.out.println("==============================\n");
				break;
				
				
			case "2":
				
				System.out.println("=========전체 고객 정보 출력=========");
				//배열에 저장된 고객정보 "name님의 나이는 age입니다" 출력.
				if(count == 0) {
					System.out.println("출력할 정보가 없습니다.");
				}
				System.out.println("고객님들의 모든정보를 출력하겠습니다.\n");
				for(int i = 0; i < count; i++) {
					System.out.println("[Index] : " + i + " [이름] : " + nameList[i] + " [나이] : " + ageList[i]);
				}
				System.out.println("==============================\n");
				break;
	
				
			case "3":
				
				boolean b3 = false; 
				System.out.println("===========고객 정보 검색===========");
				//이름을 입력받아서, 
				System.out.println("고객님의 정보를 검색 하겠습니다. [이름을 입력해주세요.]\n");
				System.out.print("이름 입력 : ");
				String searchName = sc.next();
				
				for(int i = 0; i < count; i++) {
					//배열에서 이름을 찾은 후에 "name님은 x번째에 있습니다" ,  "name~님의 나이는 age입니다" 출력
					if(searchName.equals(nameList[i])) {
						System.out.println(nameList[i] + "님은 Index " + (i) + "번째에 있습니다.");
						System.out.println(nameList[i] + "님의 나이는 " + ageList[i] + "입니다.");
						b3 = true;
					}
				}
				
				//혹시 찾는 이름이 없다면, "name님의 정보는 없습니다" 출력
				if(!b3) {
					System.out.println(searchName + " 님의 정보는 없습니다");
				}
			
				System.out.println("==============================\n");
				break;
				

			case "4":
				
				boolean b4 = false;
				System.out.println("===========고객 정보 수정===========");
				//먼저 모든 name을 출력해서 볼 수 있게 처리
				if(count == 0) {
					System.out.println("출력할 정보가 없습니다.");
				}
				System.out.println("모든 정보를 출력하겠습니다.\n");
				for(int i = 0; i < count; i++) {
					System.out.println("[Index] : " + i + " [이름] : " + nameList[i] + " [나이] : " + ageList[i]);
				}
				
				//수정할 이름을 입력을 받습니다.
				System.out.println("고객님의 정보를 수정 하겠습니다. [이름을 입력해주세요.]\n");
				System.out.print("이름 입력 : ");
				String searchName1 = sc.next();
				
				//해당이름을 배열에 찾은 후에, name, age를 다시 입력받습니다.
				for(int i = 0; i < count; i++) {
					
					//잘못 입력된 경우에는 "name님은 없습니다" 로 출력.
					if(searchName1.equals(nameList[i])) {
						System.out.print("수정할 이름 입력 : ");
						String updateName = sc.next();
						System.out.print("수정할 나이 입력 : ");
						int updateAge = sc.nextInt();
						
						//입력받은 name, age를 그 위치 인덱스에 수정해주면 됩니다.
						nameList[i] = updateName;
						ageList[i] = updateAge;
						b4 = true;
						System.out.println("고객 정보가 수정되었습니다.");
					}
				}
				
				if(!b4) {
					System.out.println(searchName1 + " 님의 정보는 없습니다");
				}
				
				System.out.println("==============================\n");
				break;
	
				
			case "5":
				
				boolean b5 = false;
				System.out.println("===========고객 정보 삭제===========");
				//먼저 모든 name을 출력해서 볼 수 있게 처리
				if(count == 0) {
					System.out.println("출력할 정보가 없습니다.");
				}
				System.out.println("모든 정보를 출력하겠습니다.\n");
				
				for(int i = 0; i < count; i++) {
					System.out.println("[Index] : " + i + " [이름] : " + nameList[i] + " [나이] : " + ageList[i]);
				}
				System.out.println();
				
				//삭제할 이름을 입력받습니다.
				System.out.print("삭제할 이름 입력 : ");
				String deleteName = sc.next();
				int deleteIndex = 0;
				for(int i = 0; i < count; i++) {
					//name이 어느위치에 있는지 찾고, 
					if(deleteName.equals(nameList[i])) {
						deleteIndex = i;
					}
				}
				
				//찾은위치에서 부터 count미만 값을 하나씩 당겨오세요.
				for(int j = deleteIndex; j< count; j++) {
					nameList[j] = nameList[j+1];
					ageList[j] = ageList[j+1];
				}
				//count위치는 null , 0으로 초기화 하고
				nameList[count-1] = null;
				ageList[count-1] = 0;
				//count를 --하면 삭제지요
				count--;
				System.out.println("고객 정보가 삭제되었습니다.");
		
				System.out.println("==============================\n");
				break;
				
				
			case "6":
				exit = true;
				System.out.println("==============================");
				System.out.println("===========프로그램 종료===========");				
				System.out.println("==============================\n");
				//while탈출 하면 됩니다.
				break;
				
			default:
				System.out.println("메뉴를 잘못 입력하셨습니다.");
				break;
			}
			
			if(exit) { //프로그램 종료
				break;
			}
			
		}
	}
}
