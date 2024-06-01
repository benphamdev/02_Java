package deSo1;

import java.util.Arrays;

public abstract class Book {
	private TheLoaiSach[] type;
	private int date, pageNumber;
	private String bookCoverName;
	private TacGia author;

	public Book(TheLoaiSach[] type, int date, int pageNumber, TacGia author, String bookCoverName) {
		this.type = type;
		this.date = date;
		this.pageNumber = pageNumber;
		this.author = author;
		this.bookCoverName = bookCoverName;
	}

	public TheLoaiSach[] getType() {
		return type;
	}

	public void setType(TheLoaiSach[] type) {
		this.type = type;
	}

	public int getDate() {
		return date;
	}

	public void setDate(int date) {
		this.date = date;
	}

	public int getPageNumber() {
		return pageNumber;
	}

	public void setPageNumber(int pageNumber) {
		this.pageNumber = pageNumber;
	}

	public TacGia getAuthor() {
		return author;
	}

	public void setAuthor(TacGia author) {
		this.author = author;
	}

	public String getBookCoverName() {
		return bookCoverName;
	}

	public void setBookCoverName(String bookCoverName) {
		this.bookCoverName = bookCoverName;
	}

	@Override
	public String toString() {
//		String ans = "";
//		for (TheLoaiSach theLoaiSach : type) {
//			ans += theLoaiSach + " ";
//		}
		return Arrays.toString(this.type) + " " + this.date + " " + this.pageNumber + " " + this.author + " "
				+ this.bookCoverName;
	}

	public abstract void summaryBookContent();

}
