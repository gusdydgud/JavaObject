package day11.inter.baisc2;

public class Dog extends Animal implements Ipet{

	@Override
	public void eating() {
		// TODO Auto-generated method stub
		System.out.println("강아지는 사료나먹으셈");
	}

	@Override
	public void playing() {
		// TODO Auto-generated method stub
		System.out.println("강아지는 산책이지");
	}

}
