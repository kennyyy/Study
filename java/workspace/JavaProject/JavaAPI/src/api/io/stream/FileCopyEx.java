package api.io.stream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;

public class FileCopyEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String path = "C:\\Users\\user\\Desktop\\course\\java\\upload\\hello.mp4";//input
		String copyPath = "C:\\Users\\user\\Desktop\\course\\java\\upload\\copy\\copy.mp4";//output
		
		try {
			FileInputStream fis = new FileInputStream(path); //들어올경로
			FileOutputStream fos = new FileOutputStream(copyPath); //나갈경로
			
			
			//바이트 배열단위로 읽음
			//byte[] arr = new byte[1000];
			//fis.read(arr);
			//System.out.println(Arrays.toString(arr));
			
			//읽은 바이트의 개수를 반환, 더 이상 읽을게 없다면 -1 반환
			byte[] arr = new byte[1000];
			int result;
			while((result = fis.read(arr)) != -1) {
				fos.write(arr, 0, result); //써내릴 배열, 시작값, 끝값(result에 배열의길이가 들어있다)
				//System.out.println(Arrays.toString(arr));
			}
			System.out.println("파일 복사 완료");
			
			
			fis.close(); //클로즈 안하면 두번째 실행부터 문제됨
			fos.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
