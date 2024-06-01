package bt2Nov25;

import java.util.ArrayList;
import java.util.List;

public class Company {
	private List<Employee> employees;

	public Company() {
		this.employees = new ArrayList<Employee>();
	}

	public void addEmployee(Employee employee) {
		employees.add(employee);
	}

	public void startWorkDay() {
		for (Employee Employee : employees) {
			Employee.performDuties();
			;
		}
	}

}
