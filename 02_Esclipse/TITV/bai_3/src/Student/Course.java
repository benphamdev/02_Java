package Student;

public class Course {
	private String nameClass, faculty;

	public String getNameClass() {
		return nameClass;
	}

	public void setNameClass(String nameClass) {
		this.nameClass = nameClass;
	}

	public String getFaculty() {
		return faculty;
	}

	public void setFaculty(String faculty) {
		this.faculty = faculty;
	}

	public Course(String nameClass, String faculty) {
		this.nameClass = nameClass;
		this.faculty = faculty;
	}

}
