package bt1Nov25;

import java.util.ArrayList;
import java.util.List;

public class Company {
	private List<IEmployee> employees;

	public Company() {
		this.employees = new ArrayList<IEmployee>();
	}

	public void addEmployee(IEmployee employee) {
		employees.add(employee);
	}

	public void startWorkDay() {
		for (IEmployee Employee : employees) {
			Employee.work();
		}
	}
}
