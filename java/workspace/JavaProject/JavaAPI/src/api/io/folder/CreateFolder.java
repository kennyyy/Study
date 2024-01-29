package api.io.folder;

import java.io.File;

public class CreateFolder {

	public static void main(String[] args) {
		//자바에서 외부경로로 폴더를 확인하거나 or 폴더(파일)를 생성하거나 or 폴더(파일)를 삭제 할 수 있습니다.
		
		//File객체를 사용합니다.
		
		String path1 = "C:\\Users\\user\\Desktop\\course\\java\\upload\\hello";//폴더
		//String path2 = "C:\\Users\\user\\Desktop\\course\\java\\upload\\hello.txt";//파일
		
		try {
			File file = new File(path1);
			//폴더(파일) 존재하는지 확인하는 메서드 exist
			if(file.exists()) { //존재하면 true, 없다면 false
				System.out.println("폴더가 존재합니다.");
			}else {
				file.mkdir();
				file.mkdirs();//필요한 모든 중간 디렉토리를 생성하여 디렉토리를 생성하게 됩니다.
				System.out.println("폴더가 존재하지 않습니다.");
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		

	}

}
