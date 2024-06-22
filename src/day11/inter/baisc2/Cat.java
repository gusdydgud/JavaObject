package day11.inter.baisc2;

public class Cat extends Animal implements Ipet {

	@Override
	public void eating() {
		// TODO Auto-generated method stub
		System.out.println("고양이는 참치캔을 먹어버리는거임~");
	}

	@Override
	public void playing() {
		// TODO Auto-generated method stub
		System.out.println("고양이는 방에서 논다");
	}

}
