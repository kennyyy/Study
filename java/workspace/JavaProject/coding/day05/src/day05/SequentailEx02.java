package 검색알고리즘;

import java.util.Scanner;

/*
 * 문자열 검색 알고리즘 구현
 */

public class SequentailEx02 {
	public static void main(String[] args) {
		String[] name = {"오수철","김선동","이강인","손흥민","박태호"};
		int i;
		String find;
		
		System.out.print("찾고자하는 이름은? ");
		Scanner scan = new Scanner(System.in);
		find = scan.next();
		
		//순차 검색 알고리즘 적용
		for(i=0; i<name.length; i++) {
			if(find.equals(name[i])) {
				System.out.println("찾고자 하는 이름은 " + name[i] + "입니다.");
				break;	//[주의]
			}
		}
		if(i == name.length) {
			System.out.println("찾고자 하는 이름은 존재하지 않습니다.");
		}
	}
}
