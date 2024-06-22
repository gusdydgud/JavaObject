package day11.inter.basic3;

public class MainClass {

	public static void main(String[] args) {
		/*
		 * 인터페이스 타입으로 선언하고, 구현체에 따라서 다른 클래스가 호출됩니다.
		 * ex)
		 * 콘센트 220v.
		 */
		Printed pt = new Samsung();//Lg();
		pt.print("hello world");
		pt.colorPrint("good by....", "검정");
		pt.copy(5);
		
		
	}
}
