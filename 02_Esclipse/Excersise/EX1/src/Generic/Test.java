package Generic;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Person implements Comparable<Person> {
	private String firstName;
	private String lastName;
	private Integer gpa;

	public Person(String firstName, String lastName, Integer gpa) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.gpa = gpa;
	}

	@Override
	public int compareTo(Person o) {
		return Integer.compare(o.gpa, this.gpa);
	}

	@Override
	public String toString() {
		return "Person [firstName=" + firstName + ", lastName=" + lastName + ", gpa=" + gpa + "]";
	}

	public Integer getGpa() {
		return gpa;
	}

	public void setGpa(Integer gpa) {
		this.gpa = gpa;
	}

}

interface MinMax<T extends Comparable<T>> {
	T min();

	T max();
}

class MinMaxImpl<T extends Comparable<T>> implements MinMax<T> {
	List<T> pp;

	MinMaxImpl(List<T> o) {
		this.pp = o;
	}

	public T min() {
		T v = pp.get(0);
		for (int i = 1; i < pp.size(); i++) {
			if (pp.get(i).compareTo(v) < 0)
				v = pp.get(i);
		}
		return v;
	}

	public T max() {
		T v = pp.get(0);
		for (int i = 1; i < pp.size(); i++) {
			if (pp.get(i).compareTo(v) > 0)
				v = pp.get(i);
		}
		return v;
	}
}

public class Test {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		Person joe = new Person("Joe", "Portman", 9);
		Person natalie = new Person("Joe", "Portman", 33);
		Person joeAgain = new Person("Natalie", "Portman", 4);
		List<Person> pp = new ArrayList<>();
		pp.add(joe);
		pp.add(natalie);
		pp.add(joeAgain);

		MinMaxImpl<Person> charMinMax = new MinMaxImpl<Person>(pp);

		System.out.println("Max value in charOfArray: " + charMinMax.max());
		System.out.println("Min value in charOfArray: " + charMinMax.min());

//		Collections.sort(pp);
//		for (Person person : pp) {
//			System.out.println(person);
//		}

//		Person[] a = new Person[3];
//		a[0] = new Person("Joe", "Portman", 9);
//		a[1] = new Person("Joe", "Portman", 33);
//		a[2] = new Person("Natalie", "Portman", 4);
//		MinMax<Person> listMinMax = new MinMaxImpl(a);
////		System.out.println(listMinMax.max());
//		Arrays.sort(a);
//		for (Person person : a) {
//			System.out.println(person);
//		}

	}
}
