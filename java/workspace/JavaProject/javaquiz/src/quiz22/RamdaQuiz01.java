package quiz22;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.text.DateFormat;
import java.text.Format;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

import javax.swing.text.DateFormatter;

public class RamdaQuiz01 {

	public static void main(String[] args) throws IOException {
		
		/*
		 * 1. 오늘날짜_data.csv파일을 읽어들입니다.
		 * 2. 각각의 행데이터를 Data클래스에 저장하고 List에 추가합니다.
		 * 3. 각 데이터들 중에서 나이가 30세 이상이거나, 지역이 서울이 포함된 데이터만 추출
		 * 
		 */

		LocalDateTime date = LocalDateTime.now();
		
		int year = date.getYear();
		int month = date.getMonthValue();
		int day = date.getDayOfMonth();
		
		String fileName = ""+ year + "_" + month + "_" + day + "_data.csv";
	
		
		
		String path = "C:\\Users\\user\\Desktop\\course\\java\\upload\\" + fileName;
		
		BufferedReader br = new BufferedReader(new FileReader(path));
		
		String str = "";
		
		List<Data> list = new ArrayList<Data>();
		
		while((str = br.readLine()) != null){
			str = str.replace(" ", "");

			String[] data = str.split(",");
			list.add(new Data(data[0], Integer.parseInt(data[1]), data[2], data[3]));
		}
		
		List<Data> newList = list.stream()
		.filter((a) -> a.getAge() >= 30 || a.getRegion().contains("서울"))
		.collect(Collectors.toList());
		
		System.out.println(newList.toString());
		
	}
	
}
