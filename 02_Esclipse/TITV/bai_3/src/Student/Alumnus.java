package Student;

public class Alumnus {
	private String ma, name;
	private Date birth;
	private Double gpa;
	private Course khoahoc;

	public Alumnus(String ma, String name, Date birth, Double gpa, Course khoahoc) {
		this.ma = ma;
		this.name = name;
		this.birth = birth;
		this.gpa = gpa;
		this.khoahoc = khoahoc;
	}

	public String getMa() {
		return ma;
	}

	public void setMa(String ma) {
		this.ma = ma;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getBirth() {
		return birth;
	}

	public void setBirth(Date birth) {
		this.birth = birth;
	}

	public Double getGpa() {
		return gpa;
	}

	public void setGpa(Double gpa) {
		this.gpa = gpa;
	}

	public Course getKhoahoc() {
		return khoahoc;
	}

	public void setKhoahoc(Course khoahoc) {
		this.khoahoc = khoahoc;
	}

	public boolean passExam() {
		return this.gpa >= 5.0;
	}

	public boolean checkSameBirth(Alumnus other) {
		return this.birth == other.birth;
	}
}
