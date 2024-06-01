package bai_9;

public class Student extends Person {
	private String nameClass, nameSchool;

	public Student(String fullName, int birth, String nameClass, String nameSchool) {
		super(fullName, birth);
		this.nameClass = nameClass;
		this.nameSchool = nameSchool;
	}

	public String getNameClass() {
		return nameClass;
	}

	public void setNameClass(String nameClass) {
		this.nameClass = nameClass;
	}

	public String getNameSchool() {
		return nameSchool;
	}

	public void setNameSchool(String nameSchool) {
		this.nameSchool = nameSchool;
	}

	public void doExercise() {
		System.out.println("do exercise!");
	}
}
