package quiz23;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class RegexQuiz03 {

	public static void main(String[] args) throws IOException {
		
		//원본과제 - 파일을 읽어서 (날짜, 지점, 등급, 내용, 가격) 형태로 excel로 출력
		
		/*
		 * 1. 건담.txt파일을 한줄씩 읽어 들입니다.
		 * 2. Product객체(날짜, 지점, 등급, 내용, 가격) 을 가지는 생성을 합니다.
		 * 3. 한 행에 대한 내용을 Product객체에 담고, 리스트에 담는다.
		 * 
		 */
		
		List<Product> list = new ArrayList<Product>();
		
		String path = "C:\\Users\\user\\Desktop\\course\\java\\workspace\\javaquiz\\src\\quiz23\\건담.txt";
		BufferedReader br = new BufferedReader(new FileReader(path));
		
		String path2 = "C:\\Users\\user\\Desktop\\course\\java\\workspace\\javaquiz\\src\\quiz23\\건담.csv";
		BufferedWriter bw = new BufferedWriter(new FileWriter(path2));
		
		String patternDate = "\\d{8}-\\d{2}-\\d{12,13}";
		String patternBranch = "[가-힣]+ [가-힣]+";
		String patternGrade = "\\[+[A-Z가-힣]+\\]+";
		String patternPrice = "([0-9,?]+[0-9]+[원?])";
		
		String[] patternArr = {patternDate, patternBranch, patternGrade, patternPrice};
		String[] productStrArr = new String[patternArr.length+1];
		
		
		String str = "";
		while((str = br.readLine()) != null) {
		
			String patternContent  = str;
			
			for(int i = 0 ; i < productStrArr.length-1; i++) {
			
				Matcher m = Pattern.compile(patternArr[i]).matcher(str);
				if(m.find()) {
					patternContent  = patternContent.replace(m.group(), "");
					productStrArr[i] = m.group();
				}
			}
			
			productStrArr[4] = patternContent.replaceFirst("   ", "");
			
			
			list.add(new Product(productStrArr[0], productStrArr[1], productStrArr[2], productStrArr[4], productStrArr[3]));
			
		}
		
		list.stream().forEach(a-> {
			System.out.println(a.getDate());
			System.out.println(a.getBranch());
			System.out.println(a.getGrade());
			System.out.println(a.getContext());
			System.out.println(a.getPrice());
			
		});
		
		br.close();
		
		createExcel(list);
		
		
	}
	public static void createExcel(List<Product> list) {
		Workbook w = new XSSFWorkbook();
		//시트생성
		Sheet s = w.createSheet("sheet1");
		
		
		for(int i = 0; i < list.size(); i++ ) {
			
			Row r = s.createRow(i);
			
			r.createCell(0).setCellValue(list.get(i).getDate());
			r.createCell(1).setCellValue(list.get(i).getBranch());
			r.createCell(2).setCellValue(list.get(i).getGrade());
			r.createCell(3).setCellValue(list.get(i).getContext());
			r.createCell(4).setCellValue(list.get(i).getPrice());
		}
		
		//행 생성
//		Row r = s.createRow(0);
//		Cell c = r.createCell(0);
//		c.setCellValue("일련번호");
//		
//		Cell c2 = r.createCell(1);
//		c2.setCellValue("지점");
//		
//		Cell c3 = r.createCell(2);
//		c3.setCellValue("등급");
//		
//		Cell c4 = r.createCell(3);
//		c4.setCellValue("가격");
//		
//		Cell c5 = r.createCell(3);
//		c5.setCellValue("내용");
		
		String path = "C:\\Users\\user\\Desktop\\course\\java\\upload\\건담.xlsx";
		
		
		try {
			FileOutputStream fos = new FileOutputStream(path);
			w.write(fos);
			w.close();
		
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
}
