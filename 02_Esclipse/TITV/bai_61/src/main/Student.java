package main;

import java.util.Objects;

public class Student {
	// tùy chọn có thể thêm interface này vào thì phải thêm method compare to
	// implements Comparable<Student>
	private String msv, fullName, birth;
	private double gpa;

	public Student(String msv, String fullName, String birth, double gpa) {
		this.msv = msv;
		this.fullName = fullName;
		this.birth = birth;
		this.gpa = gpa;
	}

	public Student(String msv) {
		this.msv = msv;
	}

	public String getMsv() {
		return msv;
	}

	public void setMsv(String msv) {
		this.msv = msv;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public String getBirth() {
		return birth;
	}

	public void setBirth(String birth) {
		this.birth = birth;
	}

	public double getGpa() {
		return gpa;
	}

	public void setGpa(double gpa) {
		this.gpa = gpa;
	}

	@Override
	public String toString() {
		return "Student [msv=" + msv + ", fullName=" + fullName + ", birth=" + birth + ", gpa=" + gpa + "]";
	}

//	@Override
//	public int compareTo(Student o) {
//		return this.msv.compareTo(o.msv);
//	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		return Objects.equals(msv, other.msv);
	}

}
