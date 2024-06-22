package day09.encap.good;

public class MyDate {
	
	private int year;
	private int month;
	private int day;
	private String ssn;
	
	/*
	 * 은닉된 변수의 값을 사용할때는 getter/setter를 사용한다.
	 * setter
	 * 1. 은닉변수에 값을 저장할 메서드
	 * 2. 접근제어자는 public으로 선언하고, 이름은 set+멤버변수명
	 * 
	 */
	public void setYears(int year) {
		//setter를 사용하면, 유효성 검증코드를 넣을 수도 있습니다.
		if(year <1 || year >2024) {
			System.out.println("잘못된 값 입력입니다.");
			return;
		}
		this.year = year;
	}
	/*
	 * getter메서드 선언
	 * 1. 은닉변수의 값을 조회하는 메서드
	 * 2. 접근제어자 public선언하고, 이름은 get + 멤버변수명
	 * 
	 */
	
	public int gerYear() {
		return year;
	}
	public void setMonth(int month) {
		if(month > 0 && month <13) {
			this.month = month;
		}else {
			System.out.println("월을 잘못입력했음");
		}
	}
	public int getMonth() {
		return month;
	}
	public void setDay(int day) {
		if(day>0 && day <32) {
			this.day = day;
		}else {
			System.out.println("일을 잘못입력했음");
		}
	}
	public int getDay() {
		return day;
	}
	public void setSsn(String ssn) {
		ssn = ssn.replace("-", "");
		if(ssn.length()==13) {
			this.ssn = ssn;
		}else {
			System.out.println("주민번호가 그게 맞나?");
		}
	}
	public String getSsn() {
		return ssn;
	}
	

}
