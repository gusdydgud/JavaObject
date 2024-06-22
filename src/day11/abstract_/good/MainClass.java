package day11.abstract_.good;

public class MainClass {
	public static void main(String[] args) {
		
		//추상클래스는 객체생성이 안됨.
//		Store s = new SeoulStore();
		//자식으로 생성해서, 부모타입에 저장하고 이것을 객체 추상화
		Store s = new BusanStore();//new SeoulStore();
		
		s.mango();
		s.melon();
		s.apple();
		String name = s.getName();
		System.out.println(name);
		
		
	}
	
}
