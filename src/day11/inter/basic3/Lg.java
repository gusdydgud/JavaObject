package day11.inter.basic3;

public class Lg implements Printed {

	//LG에 맞춰서 실행될 수 있도록 내용물을 구현
	
	public String logo = "Life is good";
	
	@Override
	public void print(String document) {
		// TODO Auto-generated method stub
		System.out.println(logo);
		System.out.println("문서출력:"+document);
	}

	@Override
	public void colorPrint(String document, String color) {
		// TODO Auto-generated method stub
		System.out.println(logo);
		System.out.println("문서출력:"+document+", 색상: "+color);
	}

	@Override
	public int copy(int cnt) {
		// TODO Auto-generated method stub
		System.out.println(logo);
		System.out.println("문서복사:"+cnt);
		
		return cnt;
	}

}
