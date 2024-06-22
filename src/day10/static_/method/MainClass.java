package day10.static_.method;

import java.util.Arrays;

public class MainClass {

	public static void main(String[] args) {
		
		Count c = new Count();
		c.method01();
		c.method02();
		//static메서드의 사용 - 클래서명.메서드명();
		Count.method02();
		
		MainClass m = new MainClass();
		m.test();
		//비밀 static메서드들
		Math.random();
		Arrays.toString(new int[3]);
//		Math.
//		String.valueOf(false);
//		Integer.parseInt("3");
		
	}
	
	
	public void test() {
		
	}
}
