package quiz19;

public class StringQuiz03 {

	public static void main(String[] args) {
		//회문비교 -> "다시 합창 합시다"
		/*
		1. String palindromeCheck(String) : boolean 함수는 매개변수로 String 값을 받아, 회문 여부를 검사하는 static 메서드입니다.
		2. 회문: 똑바로 읽으나 거꾸로 읽으나 똑같은 단어나 문장.
		3. ex) 다시 합창 합시다, 다 같은 것은 같다, 아 좋다 좋아 등
		4. 문장은 공백을 포함하여 받을 수 있습니다.
		5. 회문이라면 true, 아니라면 false 를 리턴합니다.
		6. 힌트)
		* 함수를 이용하여 공백을 제거하세요. 힌트: replace() 
		* 문장의 길이의 중간값을 구하세요. 
		* 첫문장과, 마지막문장을 비교하며 중간으로 이동

		*/
		
		System.out.println(StringQuiz03.palindromeCheck("아 좋다 좋"));
	}
	public static boolean palindromeCheck(String str) {
		String s = str.replace(" ", "");
		
		int index = s.length()-1;
		
		for(int i = 0; i < s.length()/2; i++) {
			if( s.charAt(i) != s.charAt(index - i)) {
				return false;
			}
		}
		
		
		return true;
	}

}
