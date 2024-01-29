package day04;

public class ForEx02 {

	public static void main(String[] args) {
		//랜덤수를 뽑아서 1 ~ 랜덤값 까지의 약수의 개수 구하기
		int ran = (int)(Math.random() * 100) + 1;
		
		System.out.println("랜덤수 : "+ ran);
		int cnt=0;
		for(int i = 1; i<=ran ; i++) {
			if(ran%i==0) {
				cnt+=1;
			}
		}
		System.out.println("약수의 개수 : "+cnt);
	}

}
