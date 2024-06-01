package book;

public class demo {
	public static void main(String[] args) {
		date n1 = new date(12, 2, 2023);
		author au1 =  new author("pham duy chien", n1);
		Book b1 = new Book("c++", 15, 2023, au1);
		Book b2 = new Book("python", 12.34, 2022, au1);
		System.out.println(b1);
		System.out.println(b1.checkYear(b2));
		System.out.println(b1.afterPrice(50));
	}
}
