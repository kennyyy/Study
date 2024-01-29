package api.util.date;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class LocalDateEx {

	public static void main(String[] args) {
		/*
		 * LocalDate 클래스는 년, 월, 일 정보
		 * LocalTime은 시, 분, 초 정보
		 * LocalDateTime 클래스는 두 개의 클래스가 각각 갖는 정보를 모두 가지고 있다.
		 */
		// 오늘 날짜, 2018-12-11
		LocalDate nowDate = LocalDate.now();
		System.out.println(nowDate);
		// 2018년 12월 11일, 2018-12-11
		LocalDate ofDate = LocalDate.of(2018, 12, 11);
		System.out.println(ofDate);
		// 바로 지금, 2018-12-11T13:12:11
		LocalDateTime nowDateTime = LocalDateTime.now();
		System.out.println(nowDateTime);
		// 2018년 12월 11일 15시 23분 32초, 2018-12-11T15:23:32
		LocalDateTime ofDateTime = LocalDateTime.of(2018, 12, 11, 15, 23, 32);
		System.out.println(ofDateTime);
		
		System.out.println("-------------------------------");
		//LocalDateTime -> String
		LocalDateTime now = LocalDateTime.now(); //날짜객체
		DateTimeFormatter pattern = DateTimeFormatter.ofPattern("yyyy-MM-dd HH시mm분ss초"); //포멧객체

		System.out.println(now.format(pattern));
		
		
		
	}
}
