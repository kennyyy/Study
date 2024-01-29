package com.example.bean;

public class StudentVO {
	private String id;
	private String pw;
	private String name;
	private String address;
	private int kor;
	private int math;
	
	public StudentVO() {
		// TODO Auto-generated constructor stub
	}

	public StudentVO(String id, String pw, String name, String address, int kor, int math) {
		super();
		this.id = id;
		this.pw = pw;
		this.name = name;
		this.address = address;
		this.kor = kor;
		this.math = math;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPw() {
		return pw;
	}

	public void setPw(String pw) {
		this.pw = pw;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public int getKor() {
		return kor;
	}

	public void setKor(int kor) {
		this.kor = kor;
	}

	public int getMath() {
		return math;
	}

	public void setMath(int math) {
		this.math = math;
	}
	
}
