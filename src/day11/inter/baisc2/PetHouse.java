package day11.inter.baisc2;

public class PetHouse {
	
	/*
	 * 1. 메서드생성 carePet()
	 * 매개변수 - 펫들의 공통부모타입
	 * 기능 - instanceof 사용해서 턱합한 펫타입으로 캐스팅
	 * 반환 -x
	 */
	public void carePet(Ipet a) {
		if(a instanceof Dog) {
			Dog dog = (Dog)a;
			dog.eating();
			System.out.println("강아지");
		}else if (a instanceof Cat) {
			Cat cat = (Cat)a;
			cat.eating();
			System.out.println("고양이");
		}else if ( a instanceof GoldFish) {
			GoldFish goldfish = (GoldFish)a;
			goldfish.swiming();
			System.out.println("금붕금붕");
		}
	}
	
	/*
	 * 2. 메서드생성 petInfo()
	 * 매개변수 - Ipet[]
	 * 기능 - 배열반복
	 * 반환 - x
	 */
	public void petInfo(Ipet arr[]) {
		for(Ipet i:arr) {
			i.playing();
		}
		
	}

}
