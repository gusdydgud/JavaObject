package day09.modi.member.pac2;

import day09.modi.member.pac1.A;

public class C {
	
	public C() {
		A a = new A();
		a.var1 =1;
//		a.var2 =2; //default 안됨
//		a.var3 =3; // private 안됨
		a.method01();
//		a.method02();//default 안됨
//		a.method03();// private 안됨
		
		//protected
//		A aa = new A(1);
//		aa.var = 1;
//		aa.method();
		
		
	}

}
