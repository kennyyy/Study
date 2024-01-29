package quiz38;

public class Data {

	private String year;
	private String itemCode;
	private String incomeCode;
	private String itemName;
	private String incomeName;
	private String monthWeight;
	private String monthPrice;
	private String yearWeight;
	private String yearPrice;
	private String regdate;
	
	
	public Data(String year, String itemCode, String incomeCode, String itemName, String incomeName, String monthWeight,
			String monthPrice, String yearWeight, String yearPrice, String regdate) {
		super();
		this.year = year;
		this.itemCode = itemCode;
		this.incomeCode = incomeCode;
		this.itemName = itemName;
		this.incomeName = incomeName;
		this.monthWeight = monthWeight;
		this.monthPrice = monthPrice;
		this.yearWeight = yearWeight;
		this.yearPrice = yearPrice;
		this.regdate = regdate;
	}

	@Override
	public String toString() {
		return "Data [year=" + year + ", itemCode=" + itemCode + ", incomeCode=" + incomeCode + ", itemName=" + itemName
				+ ", incomeName=" + incomeName + ", monthWeight=" + monthWeight + ", monthPrice=" + monthPrice
				+ ", yearWeight=" + yearWeight + ", yearPrice=" + yearPrice + ", regdate=" + regdate + "]";
	}




	public String getYear() {
		return year;
	}


	public void setYear(String year) {
		this.year = year;
	}


	public String getItemCode() {
		return itemCode;
	}


	public void setItemCode(String itemCode) {
		this.itemCode = itemCode;
	}


	public String getIncomeCode() {
		return incomeCode;
	}


	public void setIncomeCode(String incomeCode) {
		this.incomeCode = incomeCode;
	}


	public String getItemName() {
		return itemName;
	}


	public void setItemName(String itemName) {
		this.itemName = itemName;
	}


	public String getIncomeName() {
		return incomeName;
	}


	public void setIncomeName(String incomeName) {
		this.incomeName = incomeName;
	}


	public String getMonthWeight() {
		return monthWeight;
	}


	public void setMonthWeight(String monthWeight) {
		this.monthWeight = monthWeight;
	}


	public String getMonthPrice() {
		return monthPrice;
	}


	public void setMonthPrice(String monthPrice) {
		this.monthPrice = monthPrice;
	}


	public String getYearWeight() {
		return yearWeight;
	}


	public void setYearWeight(String yearWeight) {
		this.yearWeight = yearWeight;
	}


	public String getYearPrice() {
		return yearPrice;
	}


	public void setYearPrice(String yearPrice) {
		this.yearPrice = yearPrice;
	}


	public String getRegdate() {
		return regdate;
	}


	public void setRegdate(String regdate) {
		this.regdate = regdate;
	}
	
	
	
}
