package quiz23;

public class Product {
	/*
	 * 1. 건담.txt파일을 한줄씩 읽어 들입니다.
	 * 2. Product객체(날짜, 지점, 등급, 내용, 가격) 을 가지는 생성을 합니다.
	 * 3. 한 행에 대한 내용을 Product객체에 담고, 리스트에 담는다.
	 * 
	 */
	private String date;
	private String branch;
	private String grade;
	private String context;
	private String price;
	
	public Product() {
		// TODO Auto-generated constructor stub
	}
	
	
	public Product(String date, String branch, String grade, String context, String price) {
		super();
		this.date = date;
		this.branch = branch;
		this.grade = grade;
		this.context = context;
		this.price = price;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getBranch() {
		return branch;
	}
	public void setBranch(String branch) {
		this.branch = branch;
	}
	public String getGrade() {
		return grade;
	}
	public void setGrade(String grade) {
		this.grade = grade;
	}
	public String getContext() {
		return context;
	}
	public void setContext(String context) {
		this.context = context;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	
	
}
