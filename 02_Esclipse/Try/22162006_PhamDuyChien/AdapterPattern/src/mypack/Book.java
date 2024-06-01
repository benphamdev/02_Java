package mypack;

public class Book {
	private String title;
    private String author;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    public void borrowBook() {
        System.out.println("Book \"" + title + "\" by " + author + " is borrowed.");
    }

    public void returnBook() {
        System.out.println("Book \"" + title + "\" by " + author + " is returned.");
    }
}
