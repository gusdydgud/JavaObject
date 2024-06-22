package day09super_;

public class Child extends Parent {
	
//	Child() {
//		super(); // 부모의 기본생성자
//	}
	Child(String father,String mother){
		super(father,mother);
	}
	
/*
 * 자식은 super() 통해서 부모님의 생성자와 연결이 되어있습니다.
 * 해결방법 
 * 1. 부모님의 기본생성자를 만든다.
 * 2. 부모님의 생성자 타입과 강제연결
 */
}
