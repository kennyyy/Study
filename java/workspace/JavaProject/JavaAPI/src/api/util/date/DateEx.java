package api.util.date;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateEx {

	public static void main(String[] args) {
		Date date = new Date();
		System.out.println(date);
		
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 MM월 dd일 hh시 mm분 ss초");
		String result = sdf.format(date);
		System.out.println(result);
		
		
		sdf = new SimpleDateFormat("yyyy-MM-dd a HH:mm:ss");
		String result2 = sdf.format(date);
		System.out.println(result2);
	}

}
