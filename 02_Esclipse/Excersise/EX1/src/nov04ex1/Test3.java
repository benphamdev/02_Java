package nov04ex1;

import java.util.ArrayList;

public class Test3 {
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();

		// Adding elements to above object of Arraylist
		// Custom inputs
		list.add(20);
		list.add(4);
		list.add(76);
		list.add(21);
		list.add(3);
		list.add(80);
		var stream = list.stream();
		var numbers = stream.filter(i -> i % 2 == 0).filter(i -> i > 20);
		numbers.forEach(System.out::println);
	}
}
