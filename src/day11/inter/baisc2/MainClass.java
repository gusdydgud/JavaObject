package day11.inter.baisc2;

public class MainClass {

	public static void main(String[] args) {
		
		Animal d = new Dog();
		Animal c = new Cat();
		Animal t = new Tiger();
		Animal arr[] = {d,c,t};
		for(Animal ani:arr) {
			ani.eating();
		}
		System.out.println("---------------------------");
		//Ipet배열을 생성하고, Ipet에 들어갈 수 있는 타입은, Dog,Cat,GoldFish
		Ipet arr2[] = new Ipet[3];
		arr2[0] = (Ipet)d; //Animal과 Ipet은 관계가 없지만, dog가 상호연관성이 있다면 형변환가능
		arr2[1] = (Ipet)c;
		arr2[2] = new GoldFish(); //금붕어->Ipet으로 자동형변환
		
		for(Ipet pet:arr2) {
			pet.playing();
		}
		System.out.println("---------------");
		PetHouse an = new PetHouse();
		an.carePet(arr2[1]);
		an.petInfo(arr2);
		
		
	}
}
