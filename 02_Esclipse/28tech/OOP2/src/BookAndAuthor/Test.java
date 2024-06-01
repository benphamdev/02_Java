package BookAndAuthor;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.nextLine();
		ArrayList<Book> l = new ArrayList<>();
		for (int i = 0; i < n; i++) {
			String name = sc.nextLine();
			double price = sc.nextDouble();
			int qty = sc.nextInt();
			sc.nextLine();
			Author au = new Author(sc.nextLine(), sc.nextLine(), sc.nextLine().charAt(0));
			Book b = new Book(name, au, price, qty);
			l.add(b);
		}
		Collections.sort(l, new Comparator<Book>() {
			public int compare(Book o1, Book o2) {
				if (o1.getPrice() != o2.getPrice()) {
					if (o1.getPrice() > o2.getPrice())
						return -1;
					return 1;
				} else {
					return o1.getName().compareTo(o2.getName());
				}
			}
		});
		for (Book x : l) {
			System.out.println(x);
		}
	}
}
