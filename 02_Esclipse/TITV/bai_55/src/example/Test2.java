package example;

import java.util.Arrays;

public class Test2 {
	public static void main(String[] args) {
		Student student = new Student(2, "pham duy chien", "22162006", 3.5);
		Student student1 = new Student(3, "pham thi tlinh", "221212", 2);
		Student student2 = new Student(4, "truong ai binh", "122323", 2.2);

		System.out.println(student.compareTo(student2));
		Student a[] = new Student[] { student, student1, student2 };
		System.out.println(Arrays.toString(a));
//		Arrays.sort(a, Collections.reverseOrder());
		Arrays.sort(a);
		System.out.println(Arrays.toString(a));
		System.out.println(Arrays.binarySearch(a, student1));
	}
}
