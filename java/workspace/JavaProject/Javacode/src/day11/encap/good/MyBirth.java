package day11.encap.good;

public class MyBirth {
	//은닉 - 중요한 정보(멤버변수, 메서드) private으로 선언
	private int day;
	private int month;
	private int year;
	private String ssn; //주민번호
	
	//은닉 변수의 값에 접근할 때, 미리 생성해 놓은 getter/setter 메서드를 사용해서 접근합니다.
	
	//setter 메서드
	//1. 은닉변수에 값을 저장하기 위한 메서드
	//2. 접근제어자를 public으로 선언하고 이름은 [set(첫글자는 대문자)멤버변수명] 으로 지정
	
	//getter메서드
	//1. 은닉변수의 값을 조회하기 위한 메서드
	//2. 접근제어자를 public으로 선언하고 이름은 [get(첫글자는 대문자)멤버변수명] 으로 지정
	
	//[실습]
	//1. day, month, year, ssn에 대한 getter, setter
	// day - 1~31까지만 지정
	// month - 1~12월 까지만 저장
	// year - 1950 이상~2023년 이하인 경우만 저장
	// ssn - "-" 제거후에 13자리만 저장
	// 
	public int getDay() {
		return day;
	}
	
	public void setDay(int day) {
		if(day < 0 || day > 31) {
			System.out.println("잘못된 값인데요?");
			return;
		}
		this.day = day;
	}

	public int getMonth() {
		return month;
	}
	
	public void setMonth(int month) {
		if(month > 0 && month < 13) {
			this.month = month;
		}else {
			System.out.println("잘못된 값인데요?");
		}
	}
	
	public int getYear() {
		return year;
	}
	
	public void setYear(int year) {
		if(year >= 1950 && year <= 2023) {
			this.year = year;
		}else {
			System.out.println("잘못된 값인데요?");
		}
		
	}
	
	public String getSsn() {
		return ssn;
	}
	
	public void setSsn(String ssn) {
		String str = ssn.replace("-", "");
		if(str.length() > 0 && str.length() < 14) {
			this.ssn = ssn;
		}else {
			System.out.println("허용 글자수는 13자리까지만 입니다.");
		}
		
	}
	
	public void info() {
		System.out.println("나의 생일 : " + year + "년 " + month + "월 " + day + "일");
		System.out.println("주민번호 : " + ssn);
	}
	
	
}
