package day10.poly.basic2;

public class Student extends Person {

	String studentId;
	
	Student(String name, int age, String studentId) {
		super(name,age);
//		this.name = name;
//		this.age = age;
		this.studentId = studentId;
	}
	
	String info() {
		return super.info()+", 학번:" + studentId;
	}
	
}
