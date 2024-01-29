package completequiz01;

public class Quiz07 {

	public static void main(String[] args) {
		//array의 랜덤한 인덱스값을 뽑아 swith를 이용하여 어떤 언어를 사용하는지 출력해보시오
		String[] arr = { "안녕하세요", "hello", "니하오", "$%^&" };

		System.out.print("선택된 단어 : ");

		int index = (int) (Math.random() * arr.length);
		System.out.println(arr[index]);

		switch (index) {
		case 0:
			System.out.println("한국어 입니다");
			break;
		case 1:
			System.out.println("영어 입니다");
			break;
		case 2:
			System.out.println("중국어 입니다");
			break;
		case 3:
			System.out.println("알수없는언어 입니다");
			break;

		}

	}

}
