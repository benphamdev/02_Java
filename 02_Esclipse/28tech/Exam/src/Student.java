
public class Student {
	private String ID, fullName;
	private double gpa;

	public Student(String iD, String fullName, double gpa) {
		ID = iD;
		this.fullName = fullName;
		this.gpa = gpa;
	}

	public String getID() {
		return ID;
	}

	public void setID(String iD) {
		ID = iD;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public double getGpa() {
		return gpa;
	}

	public void setGpa(double gpa) {
		this.gpa = gpa;
	}

	@Override
	public String toString() {
		return "Student  \n  MSSV : " + this.ID + " \n  Full Name : " + this.fullName
				+ " \n" + "  GPA: " + this.gpa + "\n";
	}
}
