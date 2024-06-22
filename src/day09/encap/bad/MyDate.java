package day09.encap.bad;

public class MyDate {
	
	//은닉이 없을때
	public int year;
	public int month;
	public int day;
	public String ssn;
	public void intfo() {
		System.out.println("생년월일:"+year+"-"+month+"-"+day);
		System.out.println("주민번호:"+ssn);
	}

}
