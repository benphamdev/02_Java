package bai_9;

public class Person {
	private String fullName;
	private int birth;

	public Person(String fullName, int birth) {
		this.fullName = fullName;
		this.birth = birth;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public int getBirth() {
		return birth;
	}

	public void setBirth(int birth) {
		this.birth = birth;
	}

	public void eat() {
		System.out.println("eat food !");
	}
}
