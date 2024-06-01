import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class Employee {
	private int id;
	private String name;
	private double salary;

	public Employee(int id, String name, double salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}
}

class Point {
	int X;
	int Y;

	Point(int x, int y) {
		this.X = x;
		this.Y = y;
	}

	@Override
	public String toString() {
		return "(" + this.X + ", " + this.Y + ")";
	}
}

public class Test2 {
	static void ex1() {
		// TODO Auto-generated method stub
		List<String> listOfStrings = Arrays.asList("1", "2", "3", "4", "5");
		List<Integer> listOfIntegers = listOfStrings.stream().map(Integer::valueOf)
				.collect(Collectors.toList());
		System.out.println(listOfIntegers);
	}

	static void ex2() {
		List<Employee> employeesList = Arrays.asList(new Employee(1, "Alex", 100),
				new Employee(2, "Brian", 100), new Employee(3, "Charles", 200),
				new Employee(4, "David", 200), new Employee(5, "Edward", 300),
				new Employee(6, "Frank", 300));
		List<Double> distinctSalaries = employeesList.stream().map(Employee::getSalary)
				.distinct().collect(Collectors.toList());
		System.out.println(distinctSalaries);
	}

	static void ex3() {
		List<String> scoresAsString = Arrays.asList("85", "92", "78", "90", "88");
		double averageScore = scoresAsString.stream().mapToInt(Integer::parseInt)
				.average().orElse(0.0);
		System.out.println(averageScore);
	}

	static void ex4() {

		Arrays.asList(1, 2, 3, 4).stream().map(n -> "number" + String.valueOf(n))
				.forEach(
						n -> System.out.println(n + " as a " + n.getClass().getName()));

		Arrays.asList("1", "2", "3", "4").stream().map(n -> Integer.parseInt(n))
				.forEach(n -> System.out.println(n));
	}

	static void ex5() {
		List<Point> originalPoints = Arrays.asList(new Point(1, 2), new Point(3, 4),
				new Point(5, 6), new Point(7, 8));
		System.out.println("Original vertices: " + originalPoints);
		List<Point> scaledPoints = originalPoints.stream()
				.map(n -> new Point(n.X * 2, n.Y * 2)).collect(Collectors.toList());
		System.out.println("Scaled vertices: " + scaledPoints);
	}

	public static void main(String[] args) {
//		ex1();
//		ex2();
//		ex3();
//		ex4();
		ex5();
	}

}
