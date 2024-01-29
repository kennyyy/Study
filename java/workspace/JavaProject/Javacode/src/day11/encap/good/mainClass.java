package day11.encap.good;

public class mainClass {

	public static void main(String[] args) {
		//멤버변수를 public으로 열어두면, 잘못된 값(유효성 검증 불가)이 저장될 수 있습니다.
		MyBirth me = new MyBirth();
		
		//private라서 변수에 접근 불가
		//me.year = 2023;
		//me.month = 11;
		//me.day = 35;
		//me.ssn = "내알빠?";
		me.setDay(31); //값의 저장
		me.setDay(35); //32이상 오류
		
		me.setMonth(12);
		me.setMonth(13);//13이상 오류
		
		me.setYear(1957);
		me.setYear(1940);//1950이하 오류
		
		me.setSsn("571231-1234567");
		me.setSsn("571231-12345678");//"-" 제거후 14글자 오류
		
		int day = me.getDay();
		System.out.println(day + "일 입니다.");
		
		int month = me.getMonth();
		System.out.println(month + "월 입니다.");
		
		int year = me.getYear();
		System.out.println(year + "년 입니다.");
		
		String ssn = me.getSsn();
		System.out.println("주민번호 : " + ssn);
		
		me.info();
	}
}
