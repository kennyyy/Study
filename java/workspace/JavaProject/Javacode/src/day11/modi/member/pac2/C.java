package day11.modi.member.pac2;

import day11.modi.member.pac1.A;

public class C {
	
	public C() {
		A a = new A();
		a.var1 = 1; //public (o)
		//a.var2 = 2; //default (x)
		//a.var3 = 3; //private (x)
		

		a.method01(); //public (o)
		//a.method02(); //default (X)
		//a.method03(); //private (x)
	}

}
