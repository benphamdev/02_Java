package bai_9;

public class Main {
	public static void main(String[] args) {
		Person student = new Student("pham duy chine", 2003, "22162", "ute");// upcasting
		student.eat();
		((Student) student).doExercise();// dowcasting
//		typecasting in java
	}
}
