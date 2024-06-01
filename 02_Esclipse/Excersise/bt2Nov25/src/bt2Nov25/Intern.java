package bt2Nov25;

public class Intern extends Employee {

	protected Intern(String name) {
		super(name);
	}

	public void perforDuties() {
		System.out.println(this.name + "is assisting with simpler tasks");
	}
}
