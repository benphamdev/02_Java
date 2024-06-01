import java.util.Scanner;

class SV {
	Student data;
	SV prev, next;
}

public class Test {
	static Scanner sc = new Scanner(System.in);
	static SV head;

	// hàm tạo sinh viên = cách nhập từ bàn phím
	static SV makeStudent() {
		System.out.println("Enter Student Information ");
		System.out.print("Enter Student Code : ");
		String id = sc.nextLine();
		System.out.print("Enter Fullname : ");
		String name = sc.nextLine();
		System.out.print("Enter GPA : ");
		double gpa = sc.nextDouble();
		sc.nextLine();
		Student s = new Student(id, name, gpa);
		SV a = new SV();
		a.data = s;
		a.next = a.prev = null;
		return a;
	}

	// hàm đẩy vào cuối 1 sinh viên = cách nhập sinh viên
	static void pushBack() {
		SV newStudent = makeStudent();
		if (head == null) {
			head = newStudent;
			return;
		}
		SV temp = head;
		while (temp.next != null) {
			temp = temp.next;
		}
		temp.next = newStudent;
		newStudent.prev = temp;
	}

	// hàm tạo sinh viên = sinh viên đã được khởi tạo
	static SV makeStudent1(Student x) {
		SV a = new SV();
		a.data = x;
		a.prev = a.next = null;
		return a;
	}

	// hàm tạo sinh viên vào cuối danh sách = sinh viên đã được khởi tạo
	static void pushBack1(Student s) {
		SV newStudent = makeStudent1(s);
		if (head == null) {
			head = newStudent;
			return;
		}
		SV temp = head;
		while (temp.next != null) {
			temp = temp.next;
		}
		temp.next = newStudent;
		newStudent.prev = temp;
	}

	static void popFront() {
		if (head == null) {
			System.out.println("List is empty. Please create a list\n");
			return;
		}
		head = head.next;
		if (head != null)
			head.prev = null;
	}

	static void popBack() {
		if (head == null) {
			System.out.println("List is empty. Please create a list\n");
			return;
		}
		if (head.next == null) {
			head = null;
			return;
		}
		SV temp = head;
		while (temp.next != null)
			temp = temp.next;
		temp.prev.next = null;
	}

	static void deleteStudent(String ID) {
		if (head == null) {
			System.out.println("\nList student is empty. Please create a list\n");
			return;
		}
		if (head.data.getID().equals(ID)) {
			if (head.next != null) {
				head.next.prev = null;
			}
			head = head.next;
			return;
		}
		SV temp = head;
		while (temp != null && !temp.data.getID().equals(ID))
			temp = temp.next;
		if (temp == null) {
			System.out.println("Not found ID " + ID + "to delete");
			return;
		}
		if (temp.next != null) {
			temp.next.prev = temp.prev;
			temp.prev.next = temp.next;
		} else {
			temp.prev.next = null;
		}
	}

	static void deleteAllList() {
		if (head == null)
			return;
		head = null;
	}

	static void printHeader() {
		System.out.println("\u001B[36m" + "╔═════╦════════════════════╦═════╗");
		System.out.println("\u001B[36m" + "║     ║    LIST STUDENT    ║     ║");
		System.out.println("\u001B[36m" + "╠═════╬════════════════════╬═════╣");
		System.out.printf("\u001B[36m" + "║%-5s║%-20s║%-5s║\n", "MSSV", "Full Name",
				"GPA");
	}

	static void printFooter() {
		System.out.println("\u001B[36m" + "╚═════╩════════════════════╩═════╝");
		System.out.println("\u001B[0m");
	}

	static void printStudent(Student student) {
		System.out.println("\u001B[36m" + "╠═════╬════════════════════╬═════╣");
		System.out.printf("\u001B[36m" + "║%-5s║%-20s║%-5.1f║\n", student.getID(),
				student.getFullName(), student.getGpa());
	}

	static void printListStudent() {
		if (head == null) {
			System.out.println("\n\nList is empty.Please create the list of student\n");
			return;
		}
		printHeader();
		SV temp = head;
		while (temp != null) {
			Student student = temp.data;
			printStudent(student);
			temp = temp.next;
		}
		printFooter();
	}

	static void printNeedInforStudent() {
		SV temp = head;
		boolean flag = true;
		while (temp != null) {
			if (temp.data.getGpa() > 5) {
				flag = false;
			}
			temp = temp.next;
		}
		if (flag)
			System.out.println("\nDon't have student with gpa > 5\n");
		else {
			temp = head;
			printHeader();
			while (temp != null) {
				Student student = temp.data;
				if (student.getGpa() > 5) {
					printStudent(student);
				}
				temp = temp.next;
			}
			printFooter();
		}
	}

	static SV searchStudentCode(String ID) {
		SV temp = head;
		while (temp != null) {
			if (temp.data.getID().equals(ID)) {
				return temp;
			}
			temp = temp.next;
		}
		return null;
	}

	static void addStudentAfterMSSV(String ID) {
		if (head == null) {
			System.out.println(
					"\nList of student is empty to insert. Please create list student\n");
			return;
		}

		SV temp = searchStudentCode(ID);
		if (temp == null) {
			System.out.println("Not found student code " + ID + " to insert");
			return;
		}

		// tạo sinh viên = cách nhập từ bàn phím
//		SV newStudent = makeStudent();

		// tạo sinh viên có = khởi tạo sẵn
		SV newStudent = makeStudent1(new Student("100", "pham van thang", 9));

		if (temp.next != null) {
			temp.next.prev = newStudent;
		}
		newStudent.next = temp.next;
		temp.next = newStudent;
		newStudent.prev = temp;
	}

	static void swap(SV a, SV b) {
		SV prev = a.prev;
		SV next = b.next;
		b.prev = prev;
		b.next = a;
		a.prev = b;
		a.next = next;
		if (prev != null) {
			prev.next = b;
		} else {
			head = b;
		}
		if (next != null) {
			next.prev = a;
		}
	}

	static SV getLastNode() {
		SV curr = head;
		while (curr.next != null) {
			curr = curr.next;
		}
		return curr;
	}

	static void sortListByGPA() {
		if (head == null || head.next == null) {
			return;
		}
		boolean swapped = true;
		SV curr;
		while (swapped) {
			swapped = false;
			curr = head;
			while (curr.next != null) {
				if (curr.data.getGpa() > curr.next.data.getGpa()) {
					swap(curr, curr.next);
					swapped = true;
				} else {
					curr = curr.next;
				}
			}
		}
	}

	static void createListStudent() {
		Student s1 = new Student("1", "Pham Van Dong", 8.6);
		Student s2 = new Student("2", "Pham Thi Truc Linh", 7);
		Student s3 = new Student("3", "Truong Ai Nga", 8);
		Student s4 = new Student("4", "Le Phuong Thao", 7.5);
		Student s5 = new Student("5", "Nguyen Khanh Duy", 6);
		Student s6 = new Student("6", "Mai Thi Huynh Nhu", 4.9);
		Student s7 = new Student("7", "Phan Quoc Lap", 5.8);
		Student s8 = new Student("8", "Nguyen Van An", 3);
		Student s9 = new Student("9", "Nguyen Quang Chung", 9);
		Student s10 = new Student("10", "Bui Hugo", 9);

		pushBack1(s1);
		pushBack1(s2);
		pushBack1(s3);
		pushBack1(s4);
		pushBack1(s5);
		pushBack1(s6);
		pushBack1(s7);
		pushBack1(s8);
		pushBack1(s9);
		pushBack1(s10);
	}

	static void displayMenu() {
		System.out.println("\u001B[33m"
				+ " 1. Nhập danh sách sinh viên.                          ");
		createListStudent();
		System.out.println("\u001B[33m"
				+ " 2. Xuất danh sách sinh viên                           ");
		printListStudent();
		System.out.println("\u001B[33m"
				+ " 3. Xuất thông tin các sv có DTB>5                     ");
		printNeedInforStudent();
		System.out.println("\u001B[33m"
				+ " 4. Tìm sinh viên có mã sinh viên là X                 ");
		SV a = searchStudentCode("5");
		System.out.println("\nStudent who you locking for is :  ");
		System.out.println(a.data);
		System.out.println("\u001B[33m"
				+ " 5. Sắp xếp danh sách tăng dần theo điểm trung bình    ");
		sortListByGPA();
		printListStudent();
		System.out.println("\u001B[33m"
				+ " 6. Thêm một sinh viên vào sau sinh viên có MSSV là X  ");
		System.out.println("Thêm sinh viên có mã số 100 sau sinh viên có mã số 5\n");
		addStudentAfterMSSV("5");
		printListStudent();
		System.out.println("\u001B[33m"
				+ " 7. Xóa SV đầu danh sách                               ");
		popFront();
		printListStudent();
		System.out.println("\u001B[33m"
				+ " 8. Xóa SV cuối danh sách                              ");
		popBack();
		printListStudent();
		System.out.println("\u001B[33m"
				+ " 9. Xóa SV có mã là X                                  ");
		System.out.println("Xóa sinh viên có mã số là 5");
		deleteStudent("5");
		printListStudent();
		System.out.println("\u001B[33m"
				+ " 10. Xóa toàn bộ danh sách                             ");
		deleteAllList();
		printListStudent();
		System.out.println("\u001B[0m");
	}

	public static void main(String[] args) {
		displayMenu();
	}
}
