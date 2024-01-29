package quiz20;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MapQuiz01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Map<String, String> map = new HashMap<>();
		
		map.put("aaa123", "1234");
		map.put("bbb123", "5678");
		map.put("ccc123", "0000");
		
		//1. 아이디를 비밀번호를 입력받아서 맵에 있는 키인지 검사합니다.
		//2. 아이디가 존재하면, 비밀번호와 검사해서 비밀번호가 일치하면 "로그인 성공" 출력
		
		//3. 비밀번호가 다르다면, "비밀번호가 틀렸습니다" 출력하면 됩니다.
		//4. 만약 아이디가 맵에 입력된 키가 아니라면 "없는 아이디 입니다" 출력.
		//5. 로그인이 성공할 때까지 탈출할 수 없습니다.
		
		while(true) {
			System.out.print("아이디 입력 : ");
			String id = sc.next();
			if(map.containsKey(id)){
				System.out.print("비밀번호 입력 : ");
				String pw = sc.next();
				if(map.get(id).equals(pw)) {
					System.out.println("로그인 성공");
					break;
				}else {
					System.out.println("비밀번호가 틀렸습니다.");
				}
			}else {
				System.out.println("없는아이디 입니다.");
			}
			System.out.println("성공할때까지 프로그램 종료 안해!");
		
			
		}
		
	}

}
