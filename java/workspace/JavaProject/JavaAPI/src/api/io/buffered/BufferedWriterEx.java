package api.io.buffered;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.Scanner;

public class BufferedWriterEx {

	public static void main(String[] args) {
		/*
		 * 1. BufferedWriter는 Writer의 성능향상 스트림입니다.
		 * 2. 2단위로 빠르게 읽고씁니다
		 */
		Scanner scan = new Scanner(System.in);
		
		String path = "C:\\Users\\user\\Desktop\\course\\java\\upload\\def.txt";
		
		try {
			BufferedWriter bw = new BufferedWriter( new FileWriter(path) );
			while(true) {
				String str = scan.nextLine();
				if(str.equals("그만")) 
					break;
				bw.write(str); //2byte단위로 씀
				bw.flush(); //버퍼를 밀어냄
			}

			bw.close();//close되면 flush가 호출됨
			
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
