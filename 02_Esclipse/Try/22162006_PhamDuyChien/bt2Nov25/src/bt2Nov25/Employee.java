package bt2Nov25;

public abstract class Employee implements IWorkable {
	public String name;

	protected Employee(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public void performDuties() {
		// TODO Auto-generated method stub

	}
}
