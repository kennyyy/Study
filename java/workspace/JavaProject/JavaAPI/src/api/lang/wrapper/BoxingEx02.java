package api.lang.wrapper;

public class BoxingEx02 {

	public static void main(String[] args) {
		//wrapper는 문자열=>기본형 으로 형변환 할때 많이 사용됩니다.
		//자동형변환 == 오토언박싱 
		int a = Integer.parseInt("3");
		double b = Double.parseDouble("3.14");
		long c = Long.parseLong("5");
		
		System.out.println(a + b + c);
	
		

	}

}
