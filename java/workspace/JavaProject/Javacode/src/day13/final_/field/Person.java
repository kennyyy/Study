package day13.final_.field;

public class Person {
	//final이 변수에 붙는경우 (변경금지)
	//final변수는 반드시 초기화가 진행되어야 합니다.
	public final String nation = "대한민국";
	public final String ssn; //주민번호
	public String name;//이름
	public Person(String ssn, String name) {//위에 처럼 바로 초기화를 시켜주지 않으면 생성자를 통해 final의 초기값을 지정해줘야 사용가능
		this.ssn = ssn;
		this.name = name;
	}
	
	
	
	
}
