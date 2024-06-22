package day10.poly.basic2;

public class MainClass {
	public static void main(String[] args) {
		
		Person s1 = new Student("홍길동",20,"123123");
		Person t1 = new Teacher("세종킹",30,"국어");
		Person e1 = new Employee("장영실",20,"개발부");
		
		personInfo(s1);
		personInfo(t1);
		personInfo(e1);
	}
	//메서드 - 매개변수로 Person타입을 받는
	public static void personInfo(Person p) {
		//적절하게 캐스팅
		if(p instanceof Employee) { //p가 Employee타입이라면  true
			
			Employee e = (Employee)p;
			System.out.println("employee 캐스팅완료!");
			System.out.println(e.info());
		}else if( p instanceof Student) {
			Student s = (Student)p;
			System.out.println("student 캐스팅완료!");
			System.out.println(s.info());
		}else if( p instanceof Teacher) {
			Teacher t = (Teacher)p;
			System.out.println("teacher캐스팅 완료!");
			System.out.println(t.info());
		}
	}
	
}
