package bt1Nov25;

public abstract class Employee implements IEmployee {
	public String name;

	protected Employee(String name) {
		this.name = name;
	}

	public abstract void work();
}
