package day10.static_.field;

public class MainClass {
	public static void main(String[] args) {
		Count c = new Count();
		c.a++;
		c.b++;
		System.out.println("일반변수: "+c.a);
		System.out.println("정적변서: "+c.b);
		
		Count c2 = new Count();
		c2.a++;
		c2.b++;
		System.out.println("일변 : "+c2.a);
		System.out.println("정변 : "+c2.b);
		Count c3 = new Count();
		c3.a++;
		c3.b++;
		System.out.println("일변 : "+c3.a);
		System.out.println("정변 : "+c3.b);
		
		c3.b = 100;
		c2.b++;
		System.out.println(c.b);
		//static멤버는 쿨래스 바깥에서 생성
		//객체생성없이 클래스명.변수명으로 접근
		Count.b = 100;
		System.out.println(Count.b);
		
		
		
		
		
	}

}
