package Student;

public class Test {
	public static void main(String[] args) {
		Course khoaHoc = new Course("22162B", "FIT");
		Date ns = new Date(1, 5, 2003);
		Alumnus sv = new Alumnus("22162006", "pham duy chien", ns, 9.2, khoaHoc);
		Alumnus sv1 = new Alumnus("22162006", "pham duy chien", ns, 9.2, khoaHoc);
		System.out.println(sv.getKhoahoc().getFaculty());
		System.out.println(sv.passExam());
		System.out.println(sv.checkSameBirth(sv1));
	}
}
