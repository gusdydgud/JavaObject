package day12.exception.throw_;

public class ThrowEx01 {
	
	public static void main(String[] args) {
		//대신 예최처리를 진행
		try {
			System.out.println(sum(10));
			System.out.println(sum(-5));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("양수로 전당해야 합니다");
			System.out.println(e.getMessage()); //예외 메시지를 얻는 getter메서드
			e.printStackTrace();//예외 발생시에 예외경로를 추적하는 메시지를 출력합니다(예외 원인을 찾을때 사용
		}
		System.out.println("프로그램 정상종료");
		
	}
	
	//1~양수까지의 합
	public static int sum(int a) throws Exception {
		//음수가 들어오면, 예외를 발생시키고 메서드를 강제종료
		if(a<0) {
			//예외를 생성하게되면, 예외를 처리할 try구문이나 throws구문을 사용해서 예외처리를 진행
			
			throw new Exception("예외 메시지를 여기에 전달");// 예외 생성문
		}
		int sum =0 ;
		for(int i =1;i<=a;i++) {
			sum+=i;
		}
		return sum;
	}

}
