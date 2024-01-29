package api.io.folder;

import java.io.File;

public class DeleteFolderEx {

	public static void main(String[] args) {
		
		
		String path = "C:\\Users\\user\\Desktop\\course\\java\\upload\\hello";
		
		
		try {
			
			File file = new File(path);
			
			if(file.exists() ) {
				file.delete(); //폴더(폴더안에 empty해야 합니다) or 파일의 삭제
				System.out.println("폴더 삭제완료");
			} 
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
	}
}
