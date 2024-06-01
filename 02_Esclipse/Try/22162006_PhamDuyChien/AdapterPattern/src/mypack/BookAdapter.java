package mypack;

public class BookAdapter extends Book implements LibraryManager{

	public BookAdapter(String title, String author) {
		super(title, author);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void checkout() {
		// TODO Auto-generated method stub
		borrowBook();
	}

	@Override
	public void checkin() {
		// TODO Auto-generated method stub
		returnBook();
	}

}
