
import java.util.Scanner;

/*
 * 이분 검색 알고리즘 => 문자열 검색
 */

public class BinarySearchEx02 {
	public static void main(String[] args) {
		
		//정렬필요
		String[] name = {"김선동","마동석","박태호","손유일","오수철","최인호"};
		
		System.out.print("찾고자하는 이름은? ");
		Scanner scan = new Scanner(System.in);
		String find = scan.next();
	

		int low = 0;
		int high = 5;
		
		
		while(low <= high) {
			int mid = (low + high) / 2;
			
			if(find.equals(name[mid])) {
				System.out.println("찾고자하는 이름은 " + name[mid] + "이다.");
				return;  //프로그램 정상 종료!
			}
			
			//정확히 일치하면 0, 
			//문자가 포함되어있으면 문자열의 길이의 차이 리턴
			//비교가 불가능한 지점 에서의 각 문자열의 아스키값을 기준으로 비교하며 리턴
			//아스키가 양수라면 대상보다 뒤쪽에 존재하는 문자라는 의미
			//아스키가 음수라면 대상보다 앞쪽에 존재하는 문자라는 의미
			System.out.println(find.compareTo(name[mid])); 
			if(find.compareTo(name[mid]) > 0) { 
				low = mid + 1;
			}else {
				high = mid - 1;
			}
		}
		
		//System.out.println(find + "은 존재하지 않습니다.");
		
		
	}
	
}
