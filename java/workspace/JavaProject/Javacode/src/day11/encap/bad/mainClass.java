package day11.encap.bad;

public class mainClass {

	public static void main(String[] args) {
		//멤버변수를 public으로 열어두면, 잘못된 값(유효성 검증 불가)이 저장될 수 있습니다.
		MyBirth me = new MyBirth();
		
		me.year = 2023;
		me.month = 11;
		me.day = 35;
		me.ssn = "내알빠?";
		
		me.info();

	}

}
