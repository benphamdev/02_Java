package test;

public class Test {
	public static void main(String[] args) {
		Schedule schedule = new Schedule(Day.SATURDAY, "Math");
		Schedule schedule1 = new Schedule(Day.FRIDAY, "PE");
		Schedule schedule2 = new Schedule(Day.MONDAY, "Literature");
		System.out.println(schedule);

		int x = Month.Month_1.soNgay();
		System.out.println(x);
	}
}
