package day07;

public class PhoneMain {

	public static void main(String[] args) {
		
		Phone red = new Phone(); //new 생성자()
		red.info();
		Phone black = new Phone("검정");
		black.info();
		Phone white = new Phone("흰색",150000);
		white.info();
		Phone green = new Phone(5000,"초록");
		green.info();
		//Phone생성자, (가격, 색상, 모델)을 받는 생성자를 만들고, 객체로 생성해보세요.
		Phone ultra = new Phone(10000000,"금색","슈퍼갤럭시우주뿌셔폰");
		ultra.info();
		// TODO Auto-generated method stub

	}

}
