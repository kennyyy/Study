package api.lang.math;

public class MathEx {

	public static void main(String[] args) {
		//Math math = new Math(); //생성자가 private이기 때문에
		//Math는 전부 static메서드 입니다
		
		//랜덤수 0이상~1미만의 double형 반환
		double d = Math.random();
		System.out.println("랜덤값 : " + d);
		
	
		System.out.println("절대값:" + Math.abs(-1) );
		
		System.out.println("올림:" + Math.ceil(3.14)  );
		
		System.out.println("내림:"  + Math.floor(3.14) );
		
		System.out.println("반올림:" + Math.round(3.5) );
		
		System.out.println("큰수:"  + Math.max(3, 4)   );
		
		System.out.println("작은수:" + Math.min(3, 4)  );
		
		System.out.println("루트값:" + Math.sqrt(4)  );
	
		System.out.println("제곱" +  Math.pow(2, 3) ); //2의 3승
		

	}

}
