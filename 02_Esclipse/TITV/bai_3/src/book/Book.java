package book;

public class Book {
	private String nameBook;
	private double price;
	private int yearPublish;
	private author au;

	public Book(String nameBook, double price, int yearPublish, author au) {
		this.nameBook = nameBook;
		this.price = price;
		this.yearPublish = yearPublish;
		this.au = au;
	}

	@Override
	public String toString() {
		return "Book [nameBook=" + nameBook + ", price=" + price + ", yearPublish=" + yearPublish + ", au=" + au + "]";
	}

	public String getNameBook() {
		return nameBook;
	}

	public void setNameBook(String nameBook) {
		this.nameBook = nameBook;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getYearPublish() {
		return yearPublish;
	}

	public void setYearPublish(int yearPublish) {
		this.yearPublish = yearPublish;
	}

	public author getAu() {
		return au;
	}

	public void setAu(author au) {
		this.au = au;
	}

	public boolean checkYear(Book other) {
		return this.getYearPublish() == other.getYearPublish();
	}
	
	public double afterPrice(double x) {
		return this.price * (1 - x / 100);
	}
}
