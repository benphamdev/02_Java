package ktdhBai12;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(), m = sc.nextInt();
		ArrayList<Student> stulist = new ArrayList<>();
		ArrayList<Staff> stafflist = new ArrayList<>();
		for (int i = 0; i < n; i++) {
			sc.nextLine();
			sc.nextLine();
			stulist.add(new Student(sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextInt(), sc.nextDouble()));
		}
		for (int i = 0; i < m; i++) {
			sc.nextLine();
			sc.nextLine();
			stafflist.add(new Staff(sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextDouble()));
		}
		Collections.sort(stulist, new Comparator<Student>() {
			public int compare(Student o1, Student o2) {
				if (o1.getFee() != o2.getFee()) {
					if (o1.getFee() > o2.getFee())
						return -1;
					return 1;
				}
				return o1.getName().compareTo(o1.getName());
			}

		});
		Collections.sort(stafflist, new Comparator<Staff>() {
			public int compare(Staff o1, Staff o2) {
				if (o1.getPay() != o2.getPay()) {
					if (o1.getPay() > o2.getPay())
						return -1;
					return 1;
				}
				return o1.getName().compareTo(o2.getName());
			}

		});
		System.out.println("Student List : ");
		for (Student x : stulist) {
			System.out.println(x);
		}
		System.out.println("Staff List : ");
		for (Staff x : stafflist) {
			System.out.println(x);
		}
	}
}

//5 9
//-----------------
//Philip Smith
//PennsylvaniaRhode Island
//Health Professions
//4
//131000
//-----------------
//Rick Williams
//Wisconsin
//Visual and Performing Arts
//3
//100000
//-----------------
//Benjamin Erickson
//New Mexico
//Engineering
//1
//110000
//-----------------
//Claude Anderson
//Delaware
//Business
//1
//135000
//-----------------
//Samuel Matthews
//IllinoisIndiana
//Health Professions
//1
//109000
//-----------------
//Ramon Wheeler
//Iowa
//Harvard
//122000
//-----------------
//Dan Flores
//North Carolina
//Harvard
//187000
//-----------------
//Dan Flores
//Maryland
//Harvard
//192000
//-----------------
//Samuel Matthews
//Georgia
//Harvard
//104000
//-----------------
//Aidan Simmons
//IllinoisIndiana
//Stanford
//198000
//-----------------
//Liam Smith
//New York
//Harvard
//178000
//-----------------
//Charlie Burns
//North Dakota
//Harvard
//194000
//-----------------
//Conner Martin
//Massachusetts
//Stanford
//139000
//-----------------
//Clark Green
//Connecticut
//Harvard
//156000
//-----------------
