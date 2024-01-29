package quiz42;

import java.util.Random;

public class VoteThread implements Runnable {

	/*
	 * 쓰레드 객체 3개 생성되어야 합니다.
	 * run() 메서드 안에서는 랜덤값을 이용해서 개표 진행사항을 화면에 출력합니다.
	 *
	 * 조건: 개표율이 100를 넘어가면 안됩니다.
	 */
	int finish = 100; //개표끝
	int sum = 0; //개표율
	Random random = new Random();
	StringBuilder sb = new StringBuilder();
	
	@Override
	public void run() {
		
		while (true) {
			
			int num = random.nextInt(10); //랜덤값;
			sum += num;
			
			if(finish > sum) { //개표율이 100미만이라면 
				
				for(int i = 1 ; i <= num; i++) {
					sb.append("*");
				}
				System.out.println(Thread.currentThread().getName()+"개표율" + sum +"%:" + sb );
			
			} else { //개표율이 100보다 클때
				sum = 100;
				sb.delete(0, sum);
				
				for(int i = 1; i <= sum; i++) {
					sb.append("*");
				}
				System.out.println(Thread.currentThread().getName()+"개표율" + sum +"%:" + sb );
				break;
			}

			try {
				Thread.sleep(500);
			} catch (Exception e) {}

		} //end while
		System.out.println(Thread.currentThread().getName() + "의 개표가 완료되었습니다");
		
	}

}
