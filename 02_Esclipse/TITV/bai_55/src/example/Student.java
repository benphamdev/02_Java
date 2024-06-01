package example;

public class Student implements Comparable<Student> {
	private int maSV;
	private String fullName;
	private String nameClass;
	private double gpa;

	public Student(int maSV, String fullName, String nameClass, double gpa) {
		this.maSV = maSV;
		this.fullName = fullName;
		this.nameClass = nameClass;
		this.gpa = gpa;
	}

	public int getMaSV() {
		return maSV;
	}

	public void setMaSV(int maSV) {
		this.maSV = maSV;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public String getNameClass() {
		return nameClass;
	}

	public void setNameClass(String nameClass) {
		this.nameClass = nameClass;
	}

	public double getGpa() {
		return gpa;
	}

	public void setGpa(double gpa) {
		this.gpa = gpa;
	}

	public String getName() {
		String s = this.fullName.trim();
		if (s.indexOf(" ") >= 0) {
			int index = s.lastIndexOf(" ");
			return s.substring(index + 1);
		} else {
			return s;
		}
	}

	@Override
	public int compareTo(Student o) {
//		< 0
//		= 0
//		> 0
//		return this.maSV - o.maSV;
//		return this.getName().compareTo(o.getName());
		return this.gpa == o.gpa ? 0 : (this.gpa < o.gpa ? -1 : 1);
	}

	@Override
	public String toString() {
		return "Student [maSV=" + maSV + ", fullName=" + fullName + ", nameClass=" + nameClass + ", gpa=" + gpa + "]";
	}

}
