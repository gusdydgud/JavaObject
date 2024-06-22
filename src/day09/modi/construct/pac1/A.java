package day09.modi.construct.pac1;

public class A {
	
	A a = new A(1); // public 가능
	A a2 = new A(true); // default 가능
	A a3 = new A("ghd"); // private 가능 같은 클래스안에 들어있음
	
	public A(int a){
		
	}
	A(boolean a){
		
	}
	private A(String a){// 외부에서 객체를 생성하지 못하게 할때 private 붙임
		
	}

}
