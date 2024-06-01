package bt1Nov25;

public class Intern extends Employee {

	protected Intern(String name) {
		super(name);
	}

	@Override
	public void work() {
		System.out.println(this.name + "is learning and assiting");
	}

}
