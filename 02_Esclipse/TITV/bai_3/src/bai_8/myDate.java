package bai_8;

import java.util.Objects;

public class myDate {
	private int day, month, year;

	public myDate(int day, int month, int year) {
		if (day >= 1 && day <= 31)
			this.day = day;
		else
			this.day = 1;
		if (month <= 12 && month >= 1)
			this.month = month;
		else
			this.month = 1;
		if (year >= 0)
			this.year = year;
		else
			this.year = 1;
	}

	public void printDate() {
		System.out.println("Day : " + this.day + " Month : " + this.month + " Year : " + this.year);
	}

// getter and setter
	public int getDay() {
		return day;
	}

	public void setDay(int day) {
		if (day >= 1 && day <= 31)
			this.day = day;
	}

	public int getMonth() {
		return month;
	}

	public void setMonth(int month) {
		this.month = month;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

// toString
	@Override
	public String toString() {
		return "myDate [day=" + day + ", month=" + month + ", year=" + year + "]";
	}

// equals and hashcode

	@Override
	public int hashCode() {
		return Objects.hash(day, month, year);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		myDate other = (myDate) obj;
		return day == other.day && month == other.month && year == other.year;
	}

}
