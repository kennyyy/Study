
import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.util.Scanner;

public class OutputFlushEx {

	public static void main(String[] args) {
		
		/*
		 * 문제로 출제
		 * 
		 */
		Scanner scan = new Scanner(System.in);
		
		FileOutputStream fs = null;
		BufferedOutputStream bs = null;
		
		try {
			fs = new FileOutputStream("C:\\Users\\kgitbank\\Desktop\\test\\text.txt");
			bs = new BufferedOutputStream(fs);
			
			
			while(true) {
				System.out.print("문장을 입력하세요>");
				String str = scan.nextLine();
				
				if(str.equals("exit")) {
					break;
				}
				
				str += "\r\n";
				bs.write( str.getBytes() ); //write()는 매개변수로 바이트배열을 받습니다
				bs.flush(); //파일을 쓴후에 결과를 바로바로 확인하려면 flush를 통해 버퍼를 밀어줘야 합니다
			}

			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				//bs.close(); //bs가 닫힐 때 자동 flush()가 호출됩니다
				fs.close();
				scan.close();
			} catch (Exception e2) {
				
			}
		}
		
		
		
		
	}
}
