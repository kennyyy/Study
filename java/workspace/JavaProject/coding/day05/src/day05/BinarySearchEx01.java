import java.util.Scanner;

public class BinarySearchEx01 {
	public static void main(String[] args) {

		//배열 안의 데이터가 정렬되어 있어야 한다.
		int[] data = {30,50,80,100,110,250,300,500};
				
		//입력
		System.out.print("찾고자 하는 값은>");
		Scanner scan = new Scanner(System.in);
		int find = scan.nextInt();  //300
		
		int low = 0; //시작인덱스
		int high = 7; //끝인덱스
		
		int count = 0; //실행횟수
		//처리
		while(low <= high) {
			count++; //실행횟수 증가
			
			int mid = (low + high) / 2;  //중간인덱스를 구한다.
			
			if(find == data[mid]) { //찾을값이 
				System.out.println("찾고자하는 값은 " + mid + "번째 index에 존재.");
				System.out.println("실행횟수:" + count);
				return;
			}
			if(find > data[mid]) { //중간번째보다 크면 최소값을 미드+1 번째로 증가
				low = mid + 1;
			}else {
				high = mid - 1;
			}
			
		}
		
		System.out.println(find + "은 존재하지 않습니다.");
		
		
		
	}
}
