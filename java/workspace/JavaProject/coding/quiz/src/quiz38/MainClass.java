package quiz38;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.ToIntFunction;
import java.util.stream.Collectors;


public class MainClass {

	public static void main(String[] args) {
		/*
		 * 1. BufferedReader를 통해서 파일읅 읽어 들이세요.
		 * 2. 수출입 구분의 "수입" 항목의 품명 "오징어" 가 포함되 있는 데이터만 구분해서 list<Data>에 처리
		 * 3. 이 데이터의 수출입미화금액 총합계 를 구하세요.
		 * 
		 * if( data.indexOf("오징어") != -1 )
		 */

		List<Data> list = new ArrayList<>();
		BufferedReader br = null;
		try {

			br = new BufferedReader( new InputStreamReader( new FileInputStream("D:\\course\\java\\workspace\\quiz\\src\\quiz38\\해양수산부_수산물 품목별 수출입 현황 - 2020년 02월(월간).csv"), "EUC-KR"));

			String str;


			while( (str = br.readLine() ) != null) {

				
				String[] arr = str.replace("'", "").split(",");

				System.out.println(Arrays.toString(arr));

				String year = arr[0];
				String itemCode = arr[1];
				String incomeCode = arr[2];
				String itemName = arr[3];
				String incomeName = arr[4];
				String monthWeight = arr[5];
				String monthPrice = arr[6];
				String yearWeight = arr[7];
				String yearPrice = arr[8];
				String regdate = arr[9];

				Data data = new Data(year, itemCode, incomeCode, itemName, incomeName, monthWeight, monthPrice, yearWeight, yearPrice, regdate);
				list.add(data);

			}

			
			int sum = list.stream().filter( (data) -> {
				
				return data.getIncomeName().equals("수입");
			}).filter( (data) -> {
				
				return data.getItemName().indexOf("오징어") != -1; //포함되어 있음
			}).mapToInt( (data) -> {
				
				return Integer.parseInt(data.getMonthPrice() );
			}).sum();
			
			System.out.println("누적합계:" + sum);
			
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}


		
		
		
		
		
		
		


	}
}
