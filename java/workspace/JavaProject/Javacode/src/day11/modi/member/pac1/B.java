package day11.modi.member.pac1;

public class B {
	//생성자에 접근
	A a1 = new A(1); //public (o)
	A a2 = new A(true); //default (o)
	//A a3 = new A("홍길동"); //private (x)
	
	//-------------------------------------
	
	public B() {
		A  a = new A();
		a.var1 = 1; //public (o)
		a.var2 = 2; //default (o)
		//a.var3 = 3; //private (x)
		
		a.method01(); //public (o)
		a.method02(); //default (o)
		//a.method03(); //private (x)
	}
	
}
