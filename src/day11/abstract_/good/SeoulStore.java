package day11.abstract_.good;

public class SeoulStore extends Store{

	@Override //어노테이션 - 특정한 기능을 가지거나, 명명할때 사용함
	public void melon() {
		// TODO Auto-generated method stub
		System.out.println("서울지점 멜론 500원");
		
	}

	@Override
	public void apple() {
		// TODO Auto-generated method stub
		System.out.println("서울지점 사과 600원");
	}

	@Override
	public void orange() {
		// TODO Auto-generated method stub
		System.out.println("서울지점 오렌지 700원");
	}
	
	

}
