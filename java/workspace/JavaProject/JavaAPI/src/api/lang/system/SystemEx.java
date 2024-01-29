package api.lang.system;

import java.io.PrintStream;
import java.util.Properties;
import java.util.Scanner;

public class SystemEx {

	public static void main(String[] args) {
		//system클래스는 운영체제 관련된 기능을 가지고 있습니다.
		//전부 static메서드 입니다.
		
		//콘솔의 출력
		PrintStream out = System.out;
		out.println("hello world");
		System.out.println("hello world");
		
		//키보드로 입력
		Scanner scan = new Scanner(System.in);
		
		//운영체제 관련된 내용을 얻을 수 있음
		Properties p = System.getProperties();
		System.out.println(p);
		System.out.println(p.get("sun.desktop"));
		System.out.println( p.get("user.name"));
		System.out.println( p.get("os.version"));
		
		//1970.1.1일 부터 현재까지 지난시간을 밀리초로 반환
		//프로그램 실행 시간 체크
		long start = System.currentTimeMillis();
		System.out.println(start);
		long sum = 0;
		for(int i = 0; i<100000000; i++) {
			sum+=i;
		}
		long end = System.currentTimeMillis()- start;
		System.out.println("실행 시간 : " + end * 0.001);
		
		System.exit(0); //프로그램 종료

	
	}

}
