package quiz20;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListQuiz01 {

	public static void main(String[] args) {
		//1. 1~20까지 리스트에 저장하기
		
		
		
		/* 2. User클래스를 저장하는 리스트를 생성하기
		 * 
		 * 1) User클래스 - name, age를 은닉변수로 선언, 생성자, getter, setter
		 * 2) 객체를 2개 생성해서 list에 추가하기
		 * 3) 이 리스트에 "홍길동" 이 있다면, 이름과 나이를 출력
		 * 4) 이 리스트에 "홍길자" 이 있다면, 객체를 삭제
		 */
		
		List<Integer> list1 = new ArrayList<>();
		
		for(int i = 1; i <= 20; i++) {
			list1.add(i);
		}
		System.out.println(list1.toString());
		
		System.out.println("--------------------------------------------------------");
		
		
		List<User> list2 = new ArrayList<>();
		list2.add(new User("홍길동", 20));
		list2.add(new User("홍길자", 30));
		
		System.out.println("조건 전 : " + list2.toString());
		
		for(int i = 0; i < list2.size(); i++) {
			if(list2.get(i).getName().equals("홍길동")) {
				System.out.println("이름 : " + list2.get(i).getName());
				System.out.println("나이 : " + list2.get(i).getAge());
			}else if(list2.get(i).getName().equals("홍길자")) {
				list2.remove(i);
			}
		}
		
	
		System.out.println("조건 후 : " +list2.toString());
		
		
		

	}

}
