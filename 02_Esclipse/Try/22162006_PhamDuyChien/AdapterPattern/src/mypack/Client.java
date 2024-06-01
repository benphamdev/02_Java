package mypack;

public class Client {
	public static void main(String[] args) {
		LibraryManager book = new BookAdapter("Design Patterns",
				"Gamma, Helm, Johnson, Vlissides");
		book.checkout();
		book.checkin();
	}
}
