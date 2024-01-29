package api.lang.sbbuffer;

public class SbBufferEx {
	
	public static void main(String[] args) {

		//buffer, builder는 기능은 동일합니다.
		//buffer는 쓰레드환경에서 동기화기능제공, builder는 싱글스레드에서만 사용하는게 좋습니다.
		
		//StringBuilder sb2 = new StringBuilder("Java");

		StringBuffer sb = new StringBuffer("Java");
		String s = new String("Java");
		
		//문자열의 덧셈
		s = s + " program";//새로운 문자열 객체를 만들어서 문자열 값을 s에 대입
		
		sb.append(" Program");//원본 sb가 변함
		
		System.out.println(sb);
		System.out.println(s);
		
		//중간에 추가 insert
		sb.insert(5, "support ");
		System.out.println(sb);
		
		//문자열 변경 replace
		sb.replace(5, 12, "hello"); //이상~미만
		System.out.println(sb);
		
		//문자열 삭제 delete
		sb.delete(5, 11);
		System.out.println(sb);
		
		sb.deleteCharAt(0); //한글자 인덱스 기준으로 삭제
		System.out.println(sb);
		
		//문자열 뒤집기
		sb.reverse();
		System.out.println(sb);
		
		//문자열(String)로 변경
		String s1 = sb.toString();
		System.out.println(s1);
		
		
		
		
		
		
		
		
	}

}
