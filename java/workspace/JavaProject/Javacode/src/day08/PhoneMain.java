package day08;

public class PhoneMain {

	public static void main(String[] args) {
		
		//생성자생성만으로 객체는 사용 가능하지만 안쓰는게 좋다.
		new Phone();//생성자호출 모형, 생성자만 호출된 객체
		new Phone().color = "orange";//접근할 수 있는 참조변수가 없어서 값을 넣는 것은 가능하지만 따로 사용은 불가.
		new Phone().info();//메서드는 사용가능은 하지만 초기값이 없으면 자동초기값들이 들어간다.
		//===휴대폰 정보===
		//모델 : null
		//가격 : 0
		//색상 : null
		//결론적으로 접근할 수 있는 참조변수가 없어 이런식의 사용은 가능하지만 안쓰는게 좋다.
		
		System.out.println("-------------------");
		
		Phone red = new Phone();
		red.info();
		System.out.println("-------------------");
		
		Phone black = new Phone("black");
		black.info();
		System.out.println("-------------------");
		
		Phone blue = new Phone("black", 100000);
		blue.info();
		System.out.println("-------------------");
		
		Phone white = new Phone(50000 , "white");
		white.info();
		System.out.println("-------------------");
		
		Phone green = new Phone("갤럭시 Jump2" , 400000, "gray");
		green.info();

	}
	

}
