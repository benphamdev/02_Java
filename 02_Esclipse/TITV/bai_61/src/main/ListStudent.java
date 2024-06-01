package main;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class ListStudent {
	private ArrayList<Student> ls;

	public ListStudent() {
		this.ls = new ArrayList<Student>();
	}

	public ListStudent(ArrayList<Student> ls) {
		this.ls = ls;
	}

	public void addStudent(Student s) {
		this.ls.add(s);
	}

	public void printList() {
		for (Student student : ls) {
			System.out.println(student.toString());
		}
	}

	public boolean checkEmpty() {
		return this.ls.isEmpty();
	}

	public int getQuantityStudent() {
		return this.ls.size();
	}

	public void clearList() {
		this.ls.removeAll(ls);
	}

	public boolean checkExit(Student o) {
		return this.ls.contains(o);
	}

	public void removeStudent(Student o) {
		this.ls.remove(o);
	}

	public void search(String x) {
		for (Student student : ls)
			if (student.getFullName().indexOf(x) >= 0)
				System.out.println(student.toString());
	}

	public void sortDescend() {
		Collections.sort(ls, new Comparator<Student>() {
//			@Override
			public int compare(Student o1, Student o2) {
				return (o1.getGpa() == o2.getGpa() ? 0 : (o1.getGpa() > o2.getGpa() ? -1 : 1));
			}
		});
	}
}
