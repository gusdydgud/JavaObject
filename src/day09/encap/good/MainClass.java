package day09.encap.good;

public class MainClass {
	public static void main(String[] args) {
		
		MyDate me = new MyDate();
		me.setYears(2023);
		
		int year = me.gerYear();
		System.out.println("년도:"+year);
		me.setDay(20);
		me.setMonth(23);
		me.setSsn("940521-1234567");
		System.out.println("년도:"+me.gerYear()+" 월:"+me.getMonth()+" 일:"+me.getDay());
		System.out.println(me.getSsn());
		
	}

}
