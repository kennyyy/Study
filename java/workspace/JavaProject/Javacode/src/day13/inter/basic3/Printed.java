package day13.inter.basic3;

public interface Printed {

	//클래스가 가져야 하는 사용방법을 정의해 놓는다.
	public void turnOn();
	public void turnOff();
	public void print(String document);
	public void colorPrint(int color, String document);
	public int copy(int n);
	
}
