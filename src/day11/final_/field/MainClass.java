package day11.final_.field;

public class MainClass {

	public static void main(String[] args) {
		
		Person p1 = new Person("123123","hong gil dong");
		System.out.println(p1.nation);
//		p1.nation = "미국인"; // final변수에 붙으면 값 변경 금지.
		System.out.println(p1.ssn);
		Person p2 = new Person("33333","master yi");
		System.out.println(p2.ssn);
		System.out.println("---------------------------------");
		//상수의 사용
		System.out.println(Constant.PI);
		System.out.println(Constant.EARTH_RARIUS);
		System.out.println(Constant.VERSION);
		System.out.println(Integer.MAX_VALUE);
		
		
		
	}
}
