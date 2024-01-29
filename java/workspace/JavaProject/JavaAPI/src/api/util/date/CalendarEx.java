package api.util.date;

import java.util.Calendar;

public class CalendarEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calendar cal = Calendar.getInstance();
		
		System.out.println(cal.getTime());//현재 시간을 데이트 타입으로 반환
		
		//현재 객체의 년 월 일 시 분 초
		
		System.out.println( cal.get( Calendar.YEAR    )  );
		System.out.println( cal.get( Calendar.MONTH   ) + 1  );
		System.out.println( cal.get( Calendar.DATE    )  );
		System.out.println( cal.get( Calendar.HOUR    )  );
		System.out.println( cal.get( Calendar.MINUTE  )  );
		System.out.println( cal.get( Calendar.SECOND  )  );
		
	}

}
