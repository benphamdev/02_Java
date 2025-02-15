package BookAndAuthor;
public class Book {
	private String name;
	private Author author;
	private double price;
	private int qty = 0;

	public Book(String name, Author author, double price) {
		this.name = name;
		this.author = author;
		this.price = price;
	}

	public Book(String name, Author author, double price, int qty) {
		this.name = name;
		this.author = author;
		this.price = price;
		this.qty = qty;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Author getAuthor() {
		return author;
	}

	public void setAuthor(Author author) {
		this.author = author;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getQty() {
		return qty;
	}

	public void setQty(int qty) {
		this.qty = qty;
	}

	@Override
	public String toString() {
		return "Book Details :\n" + this.name + "\n" + (int) this.price + "\n" + this.qty + "\n"
				+ "Author Information:\n" + this.author.toString() + "\n-----------------------\n";
	}
}

//3
//Song
//800
//50
//Xuan Quynh
//xuanquynh@gmail.com
//H
//Ha Do
//600
//20
//Nguyen Nhat Anh
//nhatanh@gmai.com
//H
//To Kill a Hockingbird
//1000
//100
//Harper Lee
//lee@gmail.com
//F