package test;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class Test {
	public static void main(String[] args) {
		// lay thoi gian hien tai
		long t1 = System.currentTimeMillis();
		for (int i = 0; i < 10; i++) {
//			System.out.println(i);
		}
		long t2 = System.currentTimeMillis();
		System.out.println("truoc khi chay for : " + t1);
		System.out.println("sau khi chay for : " + t2);
		System.out.println("thoi gian : " + (t2 - t1) + "ms");

//		TimeUnit

		System.out.println("3000 year = " + TimeUnit.DAYS.toSeconds(3000 * 65) + "s");
		System.out.println("25h = " + TimeUnit.HOURS.toSeconds(25) + "s");

//		Date

		Date d = new Date(System.currentTimeMillis());
		System.out.println(d.getDate() + "/" + (d.getMonth() + 1) + "/" + (d.getYear() + 1900));

//		Calendar
		Calendar c = Calendar.getInstance();
		System.out.println(c.get(Calendar.DATE) + "-" + (c.get(Calendar.MONTH) + 1) + "-" + c.get(Calendar.YEAR));
		c.add(Calendar.MONDAY, 1);
		System.out.println(c.get(Calendar.DATE) + "-" + (c.get(Calendar.MONTH) + 1) + "-" + c.get(Calendar.YEAR));

//		DateFormat

		DateFormat df = new SimpleDateFormat();
		System.out.println(df.format(d));

		df = new SimpleDateFormat("yyyy-MM-dd H:m:s");
		System.out.println(df.format(d));
	}
}