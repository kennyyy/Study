package day02;

import java.util.Scanner;

public class ScannerExample {

	public static void main(String[] args) {
		//1. 스캐너 생성
		Scanner scan = new Scanner(System.in);
		//2. 스캐너가 가지고 있는 기능을 이용해서 데이터를 받음
		System.out.print("이름을 입력> ");
		String name =scan.next();
		
		System.out.print("나이를 입력> ");
		int age = scan.nextInt();
		
		System.out.print("키를 입력> ");
		double height = scan.nextDouble();
		//next()와 nextLine() 차이
		//next()는 공백(space) 전까지 입력받은 문자열을 반환한다는 것이다. 
		//그럼므로 스캐너에 아직 엔터가 남아있을것이다.	
		
		System.out.println("자기소개 입력> ");
		scan.nextLine();//nextLine()은 개행문자(띄어쓰기)전까지 쓴 문자열을 모두 리턴한다. 
		//그럼므로 지금 엔터값이 남아있어 그값이 실행되고 건너뛰어진 것이다..
		//마지막으로 입력받은 엔터값 소모시켜 줘야한다.
		String intro = scan.nextLine(); 
		
		
		System.out.println(name + " " + age + " " + height );
		System.out.println(intro);
		
		//자원해제
		scan.close();
		
	}
	
}
