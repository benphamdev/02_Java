package test;

public class Schedule {

	private Day day;
	private String subjects;

	public Schedule(Day day, String subjects) {
		this.day = day;
		this.subjects = subjects;
	}

	public Day getDay() {
		return day;
	}

	public void setDay(Day day) {
		this.day = day;
	}

	public String getSubjects() {
		return subjects;
	}

	public void setSubjects(String subjects) {
		this.subjects = subjects;
	}

	@Override
	public String toString() {
		return "Schedule [day=" + day + ", subjects=" + subjects + "]";
	}

}
