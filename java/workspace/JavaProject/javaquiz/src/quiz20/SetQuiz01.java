package quiz20;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class SetQuiz01 {

	public static void main(String[] args) {
		//리스트로 로또번호 구하기
		List<Integer> list = new ArrayList<>();
		Random ran = new Random();
		
		while(list.size() < 6) {
			int num = ran.nextInt(45) + 1 ;
			if(list.contains(num)) {
				continue;
			}
			list.add(num);
		}
		
		System.out.println(list.toString());
		//Set을 사용해서 로또번호 구하기
		
		Set<Integer> set = new TreeSet<>();
		while(set.size() < 6) {
			int num = ran.nextInt(45) + 1 ;
			set.add(num);
		}
		
		System.out.println(set.toString());
		
	}

}
