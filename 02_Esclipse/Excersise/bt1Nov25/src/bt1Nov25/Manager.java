package bt1Nov25;

import java.util.ArrayList;
import java.util.List;

public class Manager extends Employee implements IManager {

	private List<IEmployee> subordinates;

	public Manager(String name) {
		super(name);
		subordinates = new ArrayList<IEmployee>();
	}

	@Override
	public void work() {
		System.out.println(this.name + "is strategizing");
	}

	@Override
	public void manage() {
		System.out.println(this.name + " is managing employees");
		for (IEmployee Employee : subordinates) {
			Employee.work();
		}
	}

	public void addSubordinate(IEmployee employee) {
		subordinates.add(employee);
	}
}
