package day03;

public class SwitchEx01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a = 2;
		
		switch(a) {//()는 변수나 변수의 연산식 등이 들어갑니다 (실수는 X)
		
		
		
		case 1:
			System.out.println("1번 실행");
			break; // switch문장을 빠져나옴 ,만약 break가 없으면 해당 case부터 밑으로 순차적으로 실행된다
		case 2:
			System.out.println("2번 실행");
			break;
		case 3:
			System.out.println("3번 실행");
			break;
		case 4: // case를 붙이면 4 , 5값이 들어오면 실행함 
		case 5:
			System.out.println("4번 실행");
			break;
		
		default :
			System.out.println("case에 매칭되는 값이 없습니다.");


		}
		
	}

}
