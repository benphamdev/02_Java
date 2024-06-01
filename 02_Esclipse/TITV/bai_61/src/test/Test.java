package test;

import java.util.Scanner;

import main.ListStudent;
import main.Student;

public class Test {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ListStudent listStudent = new ListStudent();
		int op = 0;
		do {
			System.out.println("------Menu------");
			System.out.println("------ Choose your option ------");
			System.out.println("1.Add student\n" + "2.Print\n" + "3.Check Empty\n" + "4.Print Number Of Student\n"
					+ "5.Clear\n" + "6.Check Student Exit Base On MSV\n" + "7.Remove Student in List Student\n"
					+ "8.Search Student on Keyboard\n" + "9. Print Sort Descending List Student\n" + "0. Exit !\n");
			op = sc.nextInt();
			sc.nextLine();
			if (op == 1) {
				System.out.println("enter msv : ");
				String msv = sc.nextLine();
				System.out.println("enter fullName : ");
				String fullName = sc.nextLine();
				System.out.println("enter Birth : ");
				String birth = sc.nextLine();
				System.out.println("enter gpa : ");
				double gpa = sc.nextDouble();
				Student student = new Student(msv, fullName, birth, gpa);
				listStudent.addStudent(student);
			} else if (op == 2) {
				System.out.println("List Student \n");
				listStudent.printList();
			} else if (op == 3) {
				System.out.println("check empty : " + listStudent.checkEmpty());
			} else if (op == 4) {
				System.out.println("get quantity student : " + listStudent.getQuantityStudent());
			} else if (op == 5) {
				listStudent.clearList();
			} else if (op == 6) {
				System.out.println("enter msv : ");
				String msv = sc.nextLine();
				Student student = new Student(msv);
				System.out.println("Check Student Exit Base On MSV : " + listStudent.checkExit(student));
			} else if (op == 7) {
				System.out.println("enter msv : ");
				String msv = sc.nextLine();
				Student student = new Student(msv);
				System.out.println("delete Student Exit Base On MSV : ");
				listStudent.removeStudent(student);
			} else if (op == 8) {
				System.out.println("enter fullName : ");
				String fullName = sc.nextLine();
				System.out.println("Search Student on Keyboard : ");
				listStudent.search(fullName);
			} else if (op == 9) {
				System.out.println("Print Sort Descending List Student : ");
				listStudent.sortDescend();
			}
		} while (op != 0);
	}
}
