package bt2Nov25;

public class Program {
	public static void main(String[] args) {
		Company company = new Company();
		Developer dev = new Developer("Alice");
		Intern intern = new Intern("Bob");
		Manager manager = new Manager("Carol");

		manager.addTeamMember(dev);
		manager.addTeamMember(intern);

		company.addEmployee(dev);
		company.addEmployee(intern);
		company.addEmployee(manager);

		company.startWorkDay();
	}
}
