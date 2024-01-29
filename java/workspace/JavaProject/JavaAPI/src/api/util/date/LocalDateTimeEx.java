package api.util.date;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class LocalDateTimeEx {

	public static void main(String[] args) {
	
		/*
		 * LocalDate - 년 월 일
		 * LocalTime - 시 분 초
		 * LocalDateTime - 년 월 일 시 분 초
		 */
		
		//현재시간
		LocalDate now = LocalDate.now();
		System.out.println(now);
		
		//지정시간
		LocalDate now2 = LocalDate.of(2022, 10, 1);
		System.out.println(now2);
		
		//
		LocalTime now3 = LocalTime.now();
		System.out.println(now3);
		
		//LocalTime, LocalDateTime 지정시간 또한 .of()로 사용가능
		LocalDateTime now4 = LocalDateTime.now();
		System.out.println(now4);
		
		System.out.println("--------------------");
		
		
		//LocalDateTime -> String 포맷
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy년 MM월 dd일 hh:mm:ss");
		
		System.out.println(now4.format(dtf));
		
		

	}

}
