package api.util.random;

import java.util.Random;

public class RandomEx {

	public static void main(String[] args) {
		
		//랜덤객체는 다양한 난수값을 사용할 수 있습니다.
		Random ran = new Random();
		
		int r = ran.nextInt();
		System.out.println("모든 정수범위 랜덤값:" + r);
		
		int r2 = ran.nextInt(10); //0~10미만
		System.out.println("0~10미만 랜덤값:" + r2);
		
		double r3 = ran.nextDouble();
		System.out.println("0~1미만 실수랜덤값:" + r3);
		
		
		
	}
}
