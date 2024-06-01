package example;

public class Test {
	public static void main(String[] args) {
		Student student = new Student(2, "pham duy chien", "22162006", 3.5);
		Student student1 = new Student(3, "pham thi tlinh", "221212", 2);
		Student student2 = new Student(4, "truong ai binh", "122323", 2);

		System.out.println(student.compareTo(student2));
	}
}
